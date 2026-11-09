class Solution {
    public boolean checkString(String s) {
        boolean b = false;
        int n = s.length();

        for(int i=0; i<n; i++){
            if(s.charAt(i) == 'b') {
                b= true;
            }
            else if(s.charAt(i) == 'a' && b){
                return false;
            }
        }

        return true;
    }
}