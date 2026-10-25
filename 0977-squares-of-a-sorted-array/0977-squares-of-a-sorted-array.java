class Solution {
    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public int[] sortedSquares(int[] arr) {
        
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int[] ans = new int[n];

        for(int i=n-1; i>=0; i--){
            
            if(Math.abs(arr[s]) > Math.abs(arr[e])){
                ans[i] = arr[s]*arr[s];
                s++;
            }else{
                ans[i] = arr[e]*arr[e];
                e--;
            }


        }

        return ans;

    }
}