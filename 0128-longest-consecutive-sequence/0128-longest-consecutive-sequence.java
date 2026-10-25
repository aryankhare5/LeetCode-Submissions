class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for(int c : arr){
            set.add(c);
        }
        
        int longest =0;

        for(int ele : set){
            int count =0;
            int start = 0;
            
            if(!set.contains(ele-1)){
                start = ele;
                count=0;

                while(set.contains(start)){
                    count++;
                    start++;
                }
                
            }
            longest = Math.max(longest, count);
        }

        return longest;

    }
}