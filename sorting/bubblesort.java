public class bubblesort {

    public static void bubble(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }


            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,8,3,6};
        bubble(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
    
}
