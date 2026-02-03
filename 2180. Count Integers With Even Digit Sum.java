class Solution {
    public int countEven(int num) {

        int count = 0;
        for(int i=1; i<=num; i++) {
            int sum = 0;
            int x =i;
            while(x > 0) {
                //get last digit by x%10 and add it to sum
                sum += x%10; 

                //to remove last digit
                x /= 10;
            }

            if(sum % 2 == 0) {
                count++;
            }
        }
        return count;
        }
}
