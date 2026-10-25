class Solution {
    public int[] sortEvenOdd(int[] arr) {
        int n = arr.length;

        for(int j =0; j<n; j++){
            for(int i = 1; i<n-2; i+=2){
                if(arr[i] < arr[i+2]){
                    swap(arr,i, i+2);
                }
            }
            for(int i =0; i<n-2; i+=2){
                if(arr[i] > arr[i+2]){
                    swap(arr,i,i+2);
                }
            }            
        }


        return arr;
        
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}