class Solution {
    public int pivotIndex(int[] nums) {

        int n = nums.length;
        int rightSum[] = new int[nums.length];


        for(int i=n-2; i>=0; i--){
            rightSum[i] = rightSum[i+1] + nums[i+1];
        }

        int leftSum = 0;

        for(int i=0; i<n; i++){

            if(leftSum == rightSum[i]) return i;

            leftSum+=nums[i];
        }
        return -1;

        
    }
}