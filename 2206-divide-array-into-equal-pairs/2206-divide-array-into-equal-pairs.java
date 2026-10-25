class Solution {
    public boolean divideArray(int[] arr) {

        // HashMap<Integer, Integer> map = new HashMap<>();

        
        
        // for(int i=0; i<arr.length; i++){

        //     map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
        //     // if(map.containsKey(arr[i])){
        //     //     map.put(arr[i], (map.get(arr[i])+1));
        //     // } else {
        //     //     map.put(arr[i], 1);
        //     // }
        // }

        // for(int key : map.keySet()){
        //     if(map.get(key) %2 != 0) return false;
        // }

        // return true;


        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        return set.isEmpty();

        
    }
}