class Solution {
    public int minMaxGame(int[] arr) {
        int n = arr.length;
        if(n==1){
            return arr[0];
        }

        while(n>1){

            int[] ans = new int[n/2];
            int min = 0;
            int max = 0;

            for(int i =0; i<n/2; i++){
                if(i%2 == 0 ){
                    ans[i] = Math.min(arr[2*i], arr[2*i +1]); 
                }else{
                    ans[i] = Math.max(arr[2*i], arr[2*i +1]);
                }
            }  

            n = n/2;
            arr= ans;  
            
        }
        return arr[0];

        
        
    }
}