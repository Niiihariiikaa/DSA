
import java.util.HashMap;

public class twosumpair {
    public static void main(String[] args) {
        int arr[]= {1,5,7,-1,5};
        HashMap<Integer,Integer> freq=new HashMap<>();
        int cnt=0;
        int target=6;
        for(int i=0; i<arr.length; i++){
            if(freq.containsKey(target-arr[i])){
                cnt+=freq.get(target-arr[i]);
            } 
            freq.put(arr[i], freq.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(cnt);
    }
    
}
