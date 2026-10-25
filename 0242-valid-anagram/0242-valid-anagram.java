class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()){
           return false;
       }
       int[] freqS = new int[26];
       int[] freqT = new int[26];
       for(int i=0; i<s.length(); i++){
           char ch = s.charAt(i);
           ch = Character.toLowerCase(ch);
           freqS[ch-97]++;
       }
       for(int i=0; i<t.length(); i++){
           char ch = t.charAt(i);
           ch = Character.toLowerCase(ch);
           freqT[ch-97]++;
       }
       Boolean ans = Arrays.equals(freqS,freqT);
       return ans;    
    }
}