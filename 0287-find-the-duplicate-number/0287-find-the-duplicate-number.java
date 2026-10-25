class Solution {
    public int findDuplicate(int[] arr) {

        int i=0;
        
        while(i< arr.length){
            int crtIndex = arr[i] -1;
            if(arr[i] != arr[crtIndex]) swap(arr, i, crtIndex);
            else i++;
        }
        
        for(int j=0; j<arr.length; j++){
            if(arr[j] != j+1){
                return arr[j];
            }
        }
         
        return -1;
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}