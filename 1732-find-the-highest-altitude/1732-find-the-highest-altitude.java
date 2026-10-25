class Solution {
    public int largestAltitude(int[] arr) {
        int n = arr.length;
        int i =0;
        int j =0;
        int max= 0;

        while(i<n){
            j = j+arr[i];
            max = Math.max(max, j);
            i++;
        }

        return max;
    }
}