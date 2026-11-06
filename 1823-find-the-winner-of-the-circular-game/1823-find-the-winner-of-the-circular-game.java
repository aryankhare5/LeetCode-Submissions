class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++){
            list.add(i);
        }
        k = k-1;
        return solve(list, n, k, 0);
    }

    public int solve(List<Integer> list, int n, int k, int i){
        if(list.size()==1){
            return list.get(0);
        }
        i = (i+k) % list.size();
        list.remove(i);
        return solve(list, n, k, i);
    }
}