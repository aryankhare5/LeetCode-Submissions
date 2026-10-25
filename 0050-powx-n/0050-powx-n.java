class Solution {
    public double myPow(double x, int n) {
        
        boolean isNeg = false;

        if(n<0){
            isNeg = true;
            n = -n;
        }
        double ans = pow(x,n);
        return isNeg ? 1/ans : ans;
        

        
    }
    public double pow(double x, int n){
        
        if(n==1) return x;
        if(n==0) return 1;

        
        double ans = pow(x, n/2);


        if(n%2==0){
            return ans*ans;
        } else {
            return ans*ans*x;
        }
    }
}