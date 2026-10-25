class Solution {
    public int shipWithinDays(int[] arr, int d) {

        int n = arr.length;
        int ans = -1;
        
        int f = arr[0];
        int l = 0;

        for(int i=0; i<n; i++){
            f = Math.max(arr[i], f);
            l += arr[i];
        }

        while(f<=l){
            int m = f + (l-f)/2;

            if(isValid(arr, m, d)){
                ans = m;
                l = m-1;
            }else {
                f = m+1;
            }

        }
        return ans;

    }

    public boolean isValid(int arr[], int mid, int k){
        int count = 1;
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] + sum > mid){
                count++;
                sum = arr[i];
            }else{
                sum += arr[i];
            }
        }

        return count<=k;
    }
}