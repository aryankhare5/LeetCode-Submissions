class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            if(map.containsKey(target-nums[i])){
                return new int[] {map.get(target-nums[i]), i+1};
            }
            map.put(nums[i], i+1);
        }

        return new int [0];
    }
}