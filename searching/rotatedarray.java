public class rotatedarray {
    public int rots(int arr[], int key){
               int l=0;
        int h=arr.length-1;
        while(l<=h) {
            int mid= l+(h-l)/2;
            if (arr[mid]==key) {
                return mid;
            }
            
            if (arr[mid]>=arr[l]) {
                if (key < arr[mid] &&  key >= arr[l]){
                    h=mid-1;
                    
                }  else {
                    l=mid+1;
                }
                
            }  
            
            else {    
                 if (key <=arr[h] &&  key> arr[mid]){
                    l=mid+1;
                    
                    }  else {
                        h=mid-1;
                    } 
                
                }
                
            }
            
          return -1;  
        }
        
    
    public static void main(String[] args) {
        rotatedarray ra = new rotatedarray();
        int[] arr = {1,42,92,3,4};
        int key = 3;
        int result = ra.rots(arr, key);
        if (result != -1) {
            System.out.println("Element " + key + " found at index: " + result);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }
}
