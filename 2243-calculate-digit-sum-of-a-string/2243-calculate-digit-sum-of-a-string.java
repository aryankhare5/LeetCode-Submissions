class Solution {
    public String digitSum(String s, int k) {
        
        while(s.length() > k){
            int n = s.length();
            String ans = "";
            int i=0;

            while(i<n){             
                int count =0;
                int sum = 0;

                while(count < k && i<n){
                    sum += (s.charAt(i) - '0');
                    count++;
                    i++; 
                }

                ans += sum;
            }

            s=ans;
        }
             
        return s;
    }
}