package recursion.basics;
public class xpown {
    public static int calcp(int x, int n ){

        if(n==0) return 1;
        if(x==0) return 0;
        int x1=calcp(x,n-1);
        int x2= x*x1;
        return x2;
    }
    public static void main(String[] args) {
        System.out.println(calcp(2, 3));
    }
    
}
