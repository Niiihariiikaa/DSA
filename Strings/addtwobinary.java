public class addtwobinary {
    public static String addBinary(String a, String b){
        StringBuilder res=new StringBuilder();
        a=a.replaceAll("\\s", "");
        b=b.replaceAll("\\s", "");
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0|| j>=0 || carry==1){
            int sum=carry;
            if(j>=0 ) sum+=a.charAt(i--)-'0';
            if(j>=0) sum+=b.charAt(j--)-'0';
            res.append(sum%2);
            carry=sum/2;
        }
        return res.reverse().toString();

    }
     public static void main(String[] args) {
        String a = " 1 0 1 0 ";
        String b = "10 1 1";

        System.out.println("Sum = " + addBinary(a, b)); // Output: 10101
    }

    
}
