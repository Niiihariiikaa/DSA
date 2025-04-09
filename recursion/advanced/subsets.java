import java.util.*;

public class subsets {
    public static void loop(ArrayList<Integer> sub){
        for(int i=0; i<sub.size()-1; i++){
            System.out.println(sub.get(i)+" ");
        }
    }
    public static void subset(int n, ArrayList<Integer> sub){

        if(n==0){
            System.out.println(sub);
            return;
        }
        sub.add(n);
        subset(n-1, sub);

        sub.remove(sub.size()-1);
        subset(n-1,sub);



    }
    public static void main(String[] args) {
        int n=3;
        
        ArrayList<Integer> sub =new ArrayList<>();
        subset(n, sub);

    }
    
}
