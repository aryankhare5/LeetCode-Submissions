class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int n = arr.length;
        int j = 0;

        for(int i=0; i<n; i++){
            if(arr[i] % 2 == 0){
                swap(arr,i,j++);
            }
        }
        return arr;
    }
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}