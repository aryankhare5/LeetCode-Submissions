class Solution {
    public int missingNumber(int[] arr) {
        int i=0;
        while(i< arr.length){
            int crtIndex = arr[i];
            if(crtIndex < arr.length && arr[i] != arr[crtIndex]) swap(arr, i, crtIndex);
            else i++;
        }

        for(int j=0; j<arr.length; j++){
            if(arr[j] != j) return j;
        }

        return arr.length;

    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}