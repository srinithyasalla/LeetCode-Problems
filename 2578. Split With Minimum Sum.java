class Solution {
    public int splitNum(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        Arrays.sort(arr);
        String num1 = "";
        String num2 = "";
        for(int i=0;i<arr.length;i++) {
            if(i%2 == 0) {
                num1 += arr[i];
            }else {
                num2 += arr[i];
            }
        }
        return Integer.parseInt(num1)+Integer.parseInt(num2);
    }
}
