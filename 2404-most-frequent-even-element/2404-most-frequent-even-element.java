class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], (map.get(nums[i])+1));
            } else {
                map.put(nums[i], 1);
            }
        }
        int maxFreq =0;
        int ans = -1;
        for(int key : map.keySet()){

            if(key%2==0){
                if(map.get(key)>maxFreq) {
                    maxFreq = map.get(key);
                    ans = key;
                }
                else if (map.get(key) == maxFreq) {
                    ans = Math.min(ans, key);
                }
            }
        }
        return ans;
        
    }
}