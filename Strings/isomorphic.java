public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> m1= new HashMap<>();
        HashMap<Character, Character> m2= new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int i=0; i<s.length(); i++){
            char a=s.charAt(i);
            char b=t.charAt(i);

            if(m1.containsKey(a)){
                if(m1.get(a)!=b) return false;
            } else if(m2.containsKey(b)) return false;

            m1.put(a,b);
            m2.put(b,a);
        }

        return true;


        
    }
}