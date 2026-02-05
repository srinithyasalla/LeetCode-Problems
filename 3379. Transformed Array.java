class Solution {
    public int[] constructTransformedArray(int[] nums) {

        int n = nums.length;
        int result[] = new int[n];

        for(int i=0;i <nums.length;i++){

            if(nums[i] == 0) {
                result[i] = 0;
            } 
            
            else {
            int new_index = (i + nums[i]) % n;

            if (new_index < 0) {
                    new_index = new_index + n;
            }
                result[i] = nums[new_index];
            
        }
    }
        return result;
}
}
