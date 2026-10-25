class Solution {
    public int majorityElement(int[] arr) {

        int n = arr.length;

        int win = arr[0];
        int vote = 1;

        for(int i =0; i<n; i++){

            if(arr[i] == win){
                vote++;
            }else {
                vote--;
            }

            if(vote==0){
                win=arr[i];
                vote=1;
            }

        }

        return win;
    }
}