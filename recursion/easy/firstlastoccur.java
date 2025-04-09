public class firstlastoccur {
    
    public void occurance(String s, int idx, char element){
        public static int first= -1;
        public static int last= -1;

        if(idx==s.length()-1){
            return 1;
        }
        char curr=s.charAt(idx);
        if(curr==element){
            if(first=-1){
                first=idx;

            } else{
                last=idx;

            }
        }
        occurance(s, idx+1, element);

    }

    
}
