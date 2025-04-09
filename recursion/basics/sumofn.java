package recursion.basics;


public class sumofn {
    public static void natural(int n,int i, int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        natural(n,i+1, sum);

    }
    public static void main(String[] args) {
        natural(5, 1, 0);
    }
    
}
