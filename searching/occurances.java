
public class occurances {
    public int count(int arr[], int target){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        occurances oc = new occurances();
        int[] arr = {1, 2, 3, 4, 2, 5, 2};
        int target = 2;
        int result = oc.count(arr, target);
        System.out.println("The number of occurrences of " + target + " is: " + result);
    }
    
}
