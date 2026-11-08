class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i=n-1; i>=0; i--){

            while(!s.isEmpty() && arr[s.peek()]<= arr[i]){
                s.pop();
            }
            
            if(s.isEmpty() || (arr[i] > arr[s.peek()])) ans[i]=0;
            else ans[i] = s.peek()-i;

            s.push(i);
        }

        return ans;
        
    }
}