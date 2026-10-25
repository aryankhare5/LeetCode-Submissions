class Solution {
    public int[] numberOfPairs(int[] arr) {
        
        HashSet<Integer> set = new HashSet<>();

        int ans[] = new int[2];
        int count = 0;

        for (int num : arr) {
            if (set.contains(num)) {
                set.remove(num);
                count++;
            } else {
                set.add(num);
            }
        }


        ans[0] = count;
        ans[1] = set.size();

        return ans;

    }
}