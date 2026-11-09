class Solution {
    public int countAsterisks(String s) {
        int n = s.length();
        int count = 0;
        int ver = 0;
        
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '|') ver++;
            if(ver%2 ==0){
                if(s.charAt(i) == '*') count++;
            }
        }

        return count;
    }
}