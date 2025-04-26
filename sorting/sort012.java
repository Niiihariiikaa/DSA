
public class sort012 {
    public static void s012(int [] arr){
        int mid=0, hi=arr.length-1, low=0;
        while(mid<=hi){
            if (arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
                low++;
            }
            else if (arr[mid]==2){
                int temp=arr[mid];
                arr[mid]=arr[hi];
                arr[hi]=temp;
                hi--;
                
            } else {
                mid++;
            }

        }


    }
    public static void main(String[] args) {
        int[] arr={1,0,0,2,1};
        s012(arr);
        for (int num : arr) {
            System.out.print(num + " ");
    }


    
}
}
