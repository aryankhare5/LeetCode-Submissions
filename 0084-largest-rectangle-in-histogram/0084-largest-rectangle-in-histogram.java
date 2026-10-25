class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int n = arr.length;

        int[] left = new int[n];

        for(int i =0; i<n; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                left[i] = -1;
            }else{
                left[i] = s.peek();
            }            
            s.push(i);
        }

        s.clear();

        int[] right = new int[n];

        for(int i = n-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                right[i] = n;
            }else{
                right[i] = s.peek();
            }            
            s.push(i);            
        }

        int maxArea = 0;

        for(int i=0; i<n; i++){
            int area = arr[i] * ((right[i] - left[i]) -1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
        
    }
}