public class basic{
    public static void main(String[] args) {
        //Scanner sc= new Scanner(System.in);
        //String name= sc.nextLine();
        //System.out.println(name);
        //concat
        String a= "helo";
        String b= "hiii";
        System.out.println(a+" " +b);
        System.out.println(a.length());
        for(int i=0; i<a.length(); i++){
            System.out.println(a.charAt(i));
        }
        if(a.compareTo(b)==0) {
            System.out.println("equal");
        }
        String sentence="My name is Tony";
        //substring(beg index, end index) END INDEX IS NOT INCLUSIVE
        String name= sentence.substring(11, sentence.length());
        System.out.println(name);

        StringBuilder sb= new StringBuilder("hey");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'p');
        System.out.println(sb);
        sb.insert(2, 'n');
        System.out.println(sb);
        
        //reverse string

        for(int i=0; i<sb.length()/2;i++){
            int front= i;
            int back=sb.length() -1 -i; // indexing 0 1 2 3, starting index 0 last 3 length is 4 so 4-0-1=3 oth index will move to 3 
            char frontchar= sb.charAt(front);
            char backchar=sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
            System.out.println(sb);


        }

        //print all substrings 
        String s = "abc";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }


    }
    //strings are immutable



}
