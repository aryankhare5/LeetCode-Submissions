class Solution {
    public int firstMissingPositive(int[] arr) {
        int i=0;
        int n = arr.length;
        while(i<n){
            int crtIndex = arr[i] -1;
            if(arr[i]>0 && arr[i]<n && arr[i] != arr[crtIndex]) swap(arr, i, crtIndex);
            else i++;
        }

        for(int j=0; j<n; j++){
            if(arr[j] != j+1){
                return j+1;
            }
        }
        return n+1;
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}