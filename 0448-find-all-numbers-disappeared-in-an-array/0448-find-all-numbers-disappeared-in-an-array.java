class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i=0;
        while(i< arr.length){
            int crtIndex = arr[i] -1;
            if(arr[i] != arr[crtIndex]) swap(arr, i, crtIndex);
            else i++;
        }
        
        List<Integer> list = new ArrayList<>();

        for(int j=0; j<arr.length; j++){
            if(arr[j] != j+1){
                list.add(j+1);
            }
        }
        return list;        
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}