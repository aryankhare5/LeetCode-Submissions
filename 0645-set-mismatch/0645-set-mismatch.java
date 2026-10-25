class Solution {
    public int[] findErrorNums(int[] arr) {
        int i=0;
        int n = arr.length;
        while(i< n){
            int crtIndex = arr[i] -1;
            if(arr[i] <=n && arr[i] != arr[crtIndex]) swap(arr, i, crtIndex);
            else i++;
        }

        int[] temp = new int[2];

        for(int j=0; j<n; j++){
            if(arr[j] != j+1){
                temp[0] = arr[j];
                temp[1] = j+1;
            }
        }
        return temp;

    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}