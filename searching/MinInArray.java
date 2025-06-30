//minimum in sorted/rotated array
public class MinInArray {
    public int minn(int arr[]){
        int l=0;
        int h=arr.length-1;
        while(l<h){
            int mid=l+(h-l)/2;
            if(arr[mid]>arr[h]){
                l=mid+1; //minimum is in right part
            }else if(arr[mid]<arr[h]){
                h=mid; //minimum is in left part
            }else{
                h--; //if arr[mid] == arr[h], we can safely reduce h
            }
        }
        return arr[l]; //l will point to the minimum element
        
    }
    public static void main(String[] args) {
        MinInArray minInArray = new MinInArray();
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int result = minInArray.minn(arr);
        System.out.println("The minimum element in the array is: " + result);
    }
    
}
