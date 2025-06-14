//leetcode 3\
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h=new HashSet<>();
        int maxlen=0;
        int start=0;
        for (int i=0; i< s.length(); i++){
            
            
     
            while(h.contains(s.charAt(i))){
                h.remove(s.charAt(start));
                start++;
            }
            h.add(s.charAt(i));
            maxlen=Math.max(maxlen, i-start+1);
        }
        return maxlen;
    }
}