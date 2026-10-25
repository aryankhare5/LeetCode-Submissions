class Solution {
    public String greatestLetter(String s) {
        int[] freq = new int[26];
        int[] freqC = new int[26];

        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            } else if (ch >= 'A' && ch <= 'Z') {
                freqC[ch - 'A']++;
            }
        }
        char max = 0;
        for (int i = 0; i < 26; i++) {
            if(freq[i] > 0 && freqC[i] > 0){
                if((char)(i+65)>max) max = (char)(i+65);
            }
        }
        String ans;

        if (max == 0) {
            ans = "";
        } else {
            ans = String.valueOf(max);
        }
        return (ans);
    }
}