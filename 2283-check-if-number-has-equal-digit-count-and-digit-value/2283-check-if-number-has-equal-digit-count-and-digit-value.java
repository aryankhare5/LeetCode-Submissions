class Solution {
    public boolean digitCount(String num) {
        int n = num.length();
        int[] freq = new int[10];

        for(int i=0; i<n; i++){
            freq[num.charAt(i) - '0']++;
        }

        for(int i = 0; i<n; i++){
            if(num.charAt(i) - '0' != freq[i]) return false;
        }
        return true;
    }
}