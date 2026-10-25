class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int n = arr.length;
        
        int f = 1;
        int l = 0;
        int ans = -1;

        for(int i =0; i<n; i++){
            f = Math.min(arr[i], f);
            l = Math.max(arr[i], l);
        }

        while(f<=l){
            int m = f + (l-f)/2;

            if(isValid(arr, m, h)){
                ans = m;
                l = m-1;
            }else{
                f = m+1;
            }
        }

        return ans;

    }

    public boolean isValid(int[] arr, int mid, int h){
        int sum = 0;
        for(int p : arr){
            sum += Math.ceil((p*1.0)/mid);
        }
        return sum<=h;
    }
}