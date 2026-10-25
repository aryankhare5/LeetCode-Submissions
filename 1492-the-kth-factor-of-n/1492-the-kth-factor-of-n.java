class Solution {
    public int kthFactor(int n, int k) {

        ArrayList<Integer> list = new ArrayList<>();

        if(k==1) return 1;

        for(int i=1; i<Math.sqrt(n); i++){
           if(n%i==0) list.add(i);
       }
       for(int i = (int) Math.sqrt(n); i>=1; i--){
           if(n%i==0) list.add(n/i);
       }

        if (list.size()<k) return -1;
       return list.get(k-1);
        
    }
}