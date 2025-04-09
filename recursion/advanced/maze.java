public class maze {
    public static int count(int i, int j, int n, int m){

        if(i==n-1 || j==m-1) return 1;
        if(i==n|| j==m) return 0;

        int down= count(i+1, j,n,m);
        int right=count(i, j+1,n, m);
        return down+right;
    }
    public static void main(String[] args) {
        System.out.println(count(0,0,3,3));
    }
    
}
