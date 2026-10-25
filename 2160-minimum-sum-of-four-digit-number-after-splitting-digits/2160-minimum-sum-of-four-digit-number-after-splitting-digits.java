class Solution {
    public int minimumSum(int num) {
        int n = num;
        int[] arr= new int[4];
        int j =3;

        while(num>0 && j>=0){
            int dig = num%10;
            num = num/10;
            arr[j] = dig;
            j--;
        }

        Arrays.sort(arr);
        
        int num1 = arr[0]*10 + arr[2];
        int num2 = arr[1]*10 + arr[3];

        return num1+num2;
    }
}