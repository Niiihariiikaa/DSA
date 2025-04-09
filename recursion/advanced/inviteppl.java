
public class inviteppl {
    

    public static int invite(int n){
        
        if(n<=1) return 1;
        int single=invite(n-1);
        int pair=(n-1)*invite(n-2);
        return single+pair;

    }
    public static void main(String[] args) {
        System.out.println(invite(3));
    }
    
}

    

