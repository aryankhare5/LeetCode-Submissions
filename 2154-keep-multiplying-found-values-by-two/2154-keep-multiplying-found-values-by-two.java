class Solution {
    public int findFinalValue(int[] arr, int original) {

        int n = arr.length;
        boolean found = true;

        while(found){
            found = false;
            for(int i=0; i<n; i++){
                if(arr[i]==original){
                    original*=2;
                    found = true;
                    break;
                }
            }            
        }



        return original;
        
    }
}