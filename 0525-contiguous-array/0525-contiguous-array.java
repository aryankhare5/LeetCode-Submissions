class Solution {
    public int findMaxLength(int[] arr) {
        int n = arr.length;
        for(int i =0; i<n; i++){
            if(arr[i] == 0){
                arr[i] = -1;
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum =0;
        int longest = 0;

        map.put(sum, -1);
        int k = 0;

        for(int i =0; i<n; i++){
            sum += arr[i];

            if(map.containsKey(sum-k)){
                longest = Math.max(longest, i-map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }

        return longest;

    }
}