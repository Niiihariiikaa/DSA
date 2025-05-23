package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class sortbyfreq {
     public String frequencySort(String s) {
        HashMap<Character,Integer> m=new HashMap<>();
        for(char c: s.toCharArray()){
            m.put(c, m.getOrDefault(c,0)+1);

        }
        List<Character> l=new ArrayList<>(m.keySet());
        Collections.sort(l, (a,b)-> m.get(b)-m.get(a)); //sort decreasing
        StringBuilder sb= new StringBuilder();
        for(char c: l){
            int freq=m.get(c);
            for(int i=0; i<freq; i++){
                sb.append(c);
            }

        }  
        
        return sb.toString();      


        
    }
    
}
