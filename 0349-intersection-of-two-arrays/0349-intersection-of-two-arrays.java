class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int a : nums2){
            set.add(a);
        }

        for(int x : nums1){
            if(set.contains(x)){
                ans.add(x);
                set.remove(x);
            }
        }

        int[] result = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            result[i] = ans.get(i);
        }

        return result;
    }
}