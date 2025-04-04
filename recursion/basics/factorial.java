package recursion.basics;
public class factorial {
    public static int fact(int n){
        if(n==1|| n==0){
            return 1;
        }
        int f=fact(n-1);
        int f2=n*f;
        return f2;
    }
    public static void main(String[] args) {
       // fact(5);
        System.out.println(fact(5));
        
    }

    
}
