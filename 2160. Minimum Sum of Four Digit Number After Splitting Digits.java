class Solution {
    public int minimumSum(int num) {

        char arr[] = String.valueOf(num).toCharArray();

        //sort digits
        Arrays.sort(arr);

        
        int num1 = (arr[0] - '0')*10+(arr[2]-'0');
        int num2 = (arr[1] - '0')*10 + (arr[3] - '0');


        return num1 + num2;


    }
}
