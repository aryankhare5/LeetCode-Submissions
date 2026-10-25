class Solution {
    public int search(int[] arr, int target) {

       int f = 0;
       int l = arr.length-1;
       while (f <= l) {
           int m = (f+l)/2;          // formula of mid = l + (f - l)/2    ""ALWAYS REMEMBER""
           if (target == arr[m]) return m;
           else if (target>arr[m]) f=m+1;
           else l=m-1;
       }
       return -1;

    }
}