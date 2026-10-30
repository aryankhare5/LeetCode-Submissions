class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        solve (ans, nums, 0);

        return ans;
    }

    public void solve(List<List<Integer>> ans,int[] nums, int i){
        if( i == nums.length-1){

            List<Integer> list = new ArrayList<>();
            for(int x : nums){
                list.add(x);
            }

            if(!ans.contains(list)) ans.add(list);
            
        }

        for(int j =i; j<nums.length; j++){
            swap(nums,i,j);
            solve(ans,nums, i+1);
            swap(nums,i,j);
        }
    }

    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}