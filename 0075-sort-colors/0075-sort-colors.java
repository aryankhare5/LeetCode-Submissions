class Solution {
    public void sortColors(int[] nums) {

        int n = nums.length;
        
        int i = 0;
        int j = 0;
        int k = n-1;

        while(i<=k){
            if(nums[i]==2) swap(nums, i, k--);
            else if (nums[i]==0) swap(nums, i++, j++);
            else i++;
        }

    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}