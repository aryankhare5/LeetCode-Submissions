class Solution {
    public List<Integer> findDuplicates(int[] arr) {

        List<Integer> list = new ArrayList<>();
        int i=0;
        while(i< arr.length){
            int crtIndex = arr[i] -1;
            if(arr[i] != arr[crtIndex]) swap(arr, i, crtIndex);
            else i++;
        }
        
        for(int j=0; j<arr.length; j++){
            if(arr[j] != j+1){
                list.add(arr[j]);
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