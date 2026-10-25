class Solution {
    public int maxArea(int[] height) {

        int n = height.length;

        int i =0;
        int j= n-1;
        int maxArea=0;

        while(i<j){

            int l = Math.min(height[i], height[j]);
            int b = j-i;

            int area = l*b;

            maxArea = Math.max(area, maxArea);

            if(height[i]<height[j]) i++;
            else j--;

        }

        return maxArea;

    }
}