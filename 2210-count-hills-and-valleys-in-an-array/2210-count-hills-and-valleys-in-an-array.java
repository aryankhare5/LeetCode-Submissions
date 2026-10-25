class Solution {
    public int countHillValley(int[] arr) {
        int n = arr.length;
        int count = 0;

        for(int i =1; i<n-1; i++){
            if(arr[i] == arr[i-1]) continue;

            int left = i-1;
            int right = i+1;

            while(right<n && arr[right] == arr[i]) right++;

            if(right<n){
                if(arr[left]<arr[i] && arr[right]<arr[i]) count++;
                else if(arr[left]>arr[i] && arr[right]>arr[i]) count++;
            }

        }

        return count;
    }
}