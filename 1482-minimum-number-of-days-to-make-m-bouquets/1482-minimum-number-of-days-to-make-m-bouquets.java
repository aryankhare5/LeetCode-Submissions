class Solution {
    public boolean isValid(int[] arr, int mid, int m, int k){
        int bouq = 0;
        int fl = 0;

        for(int i =0; i<arr.length; i++){
            if(arr[i] <= mid) fl++;
            else fl=0;
            if(fl == k){
                bouq++;
                fl =0;
            }
        }
        return bouq>=m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int f = 1;
        int l = 0;
        int ans = -1;

        for(int i =0; i<n; i++){
            f = Math.min(bloomDay[i], f);
            l = Math.max(bloomDay[i], l);
        }

        while(f<=l){
            int mid = f + (l-f)/2;

            if(isValid(bloomDay, mid, m, k)){
                ans = mid;
                l = mid-1;
            }else{
                f = mid+1;
            }
        }
        return ans;
    }
}