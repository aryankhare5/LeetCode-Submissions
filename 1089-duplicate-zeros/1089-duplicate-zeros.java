class Solution {
    public void duplicateZeros(int[] arr) {
        
        int n = arr.length;
        int count =0;

        for(int i=0; i<n; i++){
            if(arr[i]==0) count ++;
        }

        int i= n-1;
        int j= n-1 + count;

        while(i!=j){

            if(j<n){                    // Ek baar to chalega hii agr andar hua !
                arr[j] = arr[i];
                
            }
            j--;                        // j-- hona jaruri

            if(arr[i]==0){              // Ek aur baar chalayge agr Zero hua too !! and j-- bhi karege
                if(j<n){                // Condition check !
                    arr[j] = arr[i];
                
                }                       // j-- too karege hi 
                j--;
            }

            i--;                        // Ye too hona hii hai chahe j andar hoo yaa naa ho
        }
    }
}