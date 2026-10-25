class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[] copy = new int[matrix[0]. length];
        int max = 0;
        for(int i = 0; i<matrix.length; i++){
            for(int j =0; j<copy.length; j++){
                if(matrix[i][j] == '1') copy[j]++;
                else copy[j] = 0;
            }
            max = Math.max(max, maxArea(copy));
        }

        return max;
    }

    public int maxArea(int[] arr) {
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

        int result = 0;

        for(int i=0; i<n; i++){
            int area = arr[i] * ((right[i] - left[i]) -1);
            result = Math.max(area, result);
        }

        return result;
        
    }    
}