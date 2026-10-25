class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char a : s.toCharArray()){
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        int ans = 0;
        Boolean isOdd = false;

        for(int freq : map.values()){
            if(freq%2 ==0){
                ans += freq;
            }else{
                ans += freq-1;
                isOdd = true;
            }
        }

        return isOdd ? ans+1 : ans;

    }
}