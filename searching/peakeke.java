public class peakeke {
    // Peak element is strictly greater than its neighbours
    public int peak(int arr[]) {
        int n = arr.length;
        if (n == 1) return 0;
        if (arr[0] > arr[1]) return 0;
        if (arr[n - 1] > arr[n - 2]) return n - 1;

        int l = 1;         // Start from 1 (since 0 already checked)
        int h = n - 2;     // End at n-2 (since n-1 already checked)

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid; // Found peak
            }
            if (arr[mid] < arr[mid + 1]) {
                l = mid + 1; // Go right
            } else {
                h = mid - 1; // Go left
            }
        }
        return -1; // Shouldn't reach here for valid input
    }

    public static void main(String[] args) {
        peakeke pk = new peakeke();
        int[] arr = {1, 3, 20, 4, 5};
        int result = pk.peak(arr);
        System.out.println("The peak element is at index: " + result + " with value: " + arr[result]);
    }
}
