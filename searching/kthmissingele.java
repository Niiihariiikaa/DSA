public class kthmissingele {
    public int missing(int arr[], int k) {
        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            int missing = arr[mid] - (mid + 1); // Calculate missing numbers up to mid
            
            if (missing < k) {
                l = mid + 1; // Move right if not enough missing numbers
            } else {
                h = mid - 1; // Move left if too many missing numbers
            }
        }
        
        // After the loop, l is the first index where the number of missing elements is >= k
        return l + k; // Return the kth missing element


    }
    public static void main(String[] args) {
        kthmissingele kme = new kthmissingele();
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        int result = kme.missing(arr, k);
        System.out.println("The " + k + "th missing element is: " + result);
    }
    
}
