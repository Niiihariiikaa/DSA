import java.util.*;
public class MajorityElement {
    public static void majority(int nums[]){
        HashMap<Integer, Integer> h= new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if(h.containsKey(nums[i])){
                h.put(nums[i], h.get(nums[i])+1);
            }
            else{
                h.put(nums[i], 1);
            }
            for(int k: h.keySet()){
                if(h.get(k)> nums.length/3){
                    System.out.println(k);
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[]= {1,2,3,5,1,7,1,1,7,3};
        majority(nums);
    }
    
}
