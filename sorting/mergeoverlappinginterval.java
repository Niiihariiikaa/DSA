import java.util.*;

public class mergeoverlappinginterval {
    public List<int[]> mergeOverlap(int[][] arr) {
        Arrays.sort(arr, (a,b)-> Integer.compare(a[0],b[0]));
        List <int[]> res=new ArrayList<>();
        res.add(new int[] {arr[0][0], arr[0][1]});
        for(int i=1; i<arr.length;i++){
            int[] last=res.get(res.size()-1);
            int[] curr= arr[i];
            if(curr[0]<=last[1]){
                last[1]=Math.max(curr[1], last[1]);

            } else{
                res.add(new int[] {curr[0],curr[1]});
            }


        }
        return res;

    }
    public static void main(String[] args) {
        int[][] arr = new int[][] { {1, 3}, {2, 4}, {6, 8}, {9, 10} };

        mergeoverlappinginterval obj = new mergeoverlappinginterval();
        List<int[]> merged = obj.mergeOverlap(arr);

        System.out.println("Merged Intervals:");
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }

    
}
