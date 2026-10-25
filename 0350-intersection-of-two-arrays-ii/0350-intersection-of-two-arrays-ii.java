class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for(int a : nums1) map.put(a, map.getOrDefault(a,0) + 1);

        for(int i : nums2){
            if(map.containsKey(i) && map.get(i)>0){
                ans.add(i);
                map.put(i, map.get(i)-1);
            }
        }

        int n = ans.size();
        int[] result = new int[n];

        for(int i =0; i<n; i++){
            result[i] = ans.get(i);
        }

        return result;
    }
}