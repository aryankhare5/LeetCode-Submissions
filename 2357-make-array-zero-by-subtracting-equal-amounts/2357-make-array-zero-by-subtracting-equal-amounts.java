class Solution {
    public int minimumOperations(int[] arr) {

        Set<Integer> set = new HashSet<>();

        for(int i : arr){
            if(i>0) set.add(i);
        }

        return set.size();
        
    }
}