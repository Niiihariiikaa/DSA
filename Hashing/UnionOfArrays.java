import java.util.*;

public class UnionOfArrays {
    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            set.add(num);
        }

        result.addAll(set);
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        
        ArrayList<Integer> union = findUnion(arr1, arr2);
        System.out.println("Union of arrays: " + union);
    }
}
