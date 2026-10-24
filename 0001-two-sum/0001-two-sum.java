class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int temp[] = new int[2];
        // for (int i=0; i<nums.length; i++){
        //     for (int j=i+1; j<nums.length; j++){
        //         if((nums[i] + nums[j]) == target){
        //         temp[0] = i;
        //         temp[1] = j;
        //         }
        //     }
        // }
        // return temp;        

        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            if(map.containsKey(target-nums[i])){
                return new int[] {i, map.get(target-nums[i])};
            }
            map.put(nums[i], i);
        }

        return new int [0];


    }
       
}