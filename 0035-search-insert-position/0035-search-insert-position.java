class Solution {
    public int searchInsert(int[] arr, int target) {
        
        int f = 0;
        int l = arr.length-1;
        while (f <= l) {
            int m = l + (f - l)/2;         
            if (target == arr[m]) return m;
            else if (target>arr[m]) f=m+1;
            else l=m-1;
        }
        return f;

    }  
}