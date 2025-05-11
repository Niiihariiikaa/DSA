import java.util.HashMap;

public class subarraysum {

    public static void main(String[] args) {
        int[] arr= {3,4,1,4,2,6,1};
        int k= 7;
        HashMap<Integer, Integer> h=new HashMap<>();
        h.put(0,1); //empty subarray
        int ans=0;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            //condition
            if(h.containsKey(sum-k)){
                ans += h.get(sum-k);

            }

            //filling map
            if(h.containsKey(sum)){
                h.put(sum, h.get(sum)+1);
            } else {
                h.put(sum,1);
            }

        }
        System.out.println(ans);
    }
    
    
}
