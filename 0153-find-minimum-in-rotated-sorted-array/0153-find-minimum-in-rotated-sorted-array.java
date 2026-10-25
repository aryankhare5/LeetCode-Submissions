class Solution {
    public int findMin(int[] arr) {
        
        int s = 0;
        int e = arr.length-1;
        int min = Integer.MAX_VALUE;

        while(s<=e){

            int m = s + (e-s)/2;

            if(arr[m] >= arr[s]){
                min = Math.min(min, arr[s]);
                s=m+1;
            }else{
                min = Math.min(min, arr[m]);
                e= m-1;
            }

        }

        return min;

    }
}