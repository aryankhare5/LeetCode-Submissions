class Solution {
    public boolean checkDistances(String s, int[] distance) {
        Boolean ans = true;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int chk = s.lastIndexOf(ch) - s.indexOf(ch) -1;
            if (distance[ch - 97] != chk) {
                return false;
            }
        }
        return ans;
    }
}