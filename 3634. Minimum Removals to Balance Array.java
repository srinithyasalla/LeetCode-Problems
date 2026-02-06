class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int i =0;   
        int max_len = 1;  //atleast 1 element is always balanced
        
        for(int j=0;j<n;j++) {
            
                while((long)nums[j] > (long)nums[i]*k) {
                    i++;
                
            }
            int current_len = j - i + 1;
            max_len = Math.max(max_len,current_len);
        }
        return n - max_len;
       
    }
}
