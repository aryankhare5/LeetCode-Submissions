class Solution {
    public int maximumWealth(int[][] acc) {
        int n = acc.length;

        int maxSum =0;

        for(int i =0; i<n; i++){
            int sum =0;
            for(int j=0; j<acc[i].length; j++){
                sum += acc[i][j];
            }
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}