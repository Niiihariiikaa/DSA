
public class allpermut {
    public static void printperm(String s, String permutation){

        if(s.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0; i<s.length(); i++){
            char curr= s.charAt(i);
        
            String newstr= s.substring(0,i) + s.substring(i+1);
            printperm(newstr, permutation+curr);

        }
        
    
}

public static void main(String[] args) {
    String s="abc";
    printperm(s, "");
}
}
