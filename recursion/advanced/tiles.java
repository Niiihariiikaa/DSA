
public class tiles {
    public static int place(int n, int m){
        if(n==m) return 2;
        if(n<m) return 1;
        int v=place(n-m,m);
        int h=place(n-1,m);
        return v+h;

    }
    public static void main(String[] args) {
        System.out.println(place(4,2));
    }
    
}
