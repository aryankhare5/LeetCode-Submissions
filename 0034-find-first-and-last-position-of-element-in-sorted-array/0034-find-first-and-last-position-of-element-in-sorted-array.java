class Solution {
    public int[] searchRange(int[] arr, int target) {
        int first = firstpos(arr,target);
        int last = lastpos(arr,target);

        return new int[] {first, last};
    }

    public static int firstpos(int[] arr, int target){
        int s= 0;
        int e= arr.length-1;
        int ans=-1;

        while(s<=e){
            int m = s + (e-s)/2;
            if (target == arr[m]) {
                ans = m;
                e=m-1;
            } 
            else if (target>arr[m]) s=m+1;
            else e=m-1;        
        }

        return ans;
    }

    public static int lastpos(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        int ans = -1;

        while(s<=e){
            int m = s + (e-s)/2;
            if(target==arr[m]){
                ans=m;
                s=m+1;
            }
            else if (target>arr[m]) s=m+1;
            else e=m-1;
        }
        return ans;
    }
}