class Solution {
    public int maxDistance(int[] arr) {

        int n = arr.length;
        int max = 0;

        for(int i=0; i<n; i++){
            if(arr[i] != arr[n-1]){
                max = Math.max(max, (n-1-i));
            }
        }

        for(int i=n-1; i>=0; i--){
            if(arr[0] != arr[i]){
                max = Math.max(max, i-0);
            }
        }


        return max;



        //Brute Force Method

        // int n = arr.length;
        
        // int max = 0;

        // for(int i=0; i<n; i++){
        //     for(int j=i; j<n; j++){
        //         if(arr[i] != arr[j]){
        //             max = Math.max(max, Math.abs(i-j));
        //         }
        //     }
            
        // }

        // return max;
        
    }
}