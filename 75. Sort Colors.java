class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;        //pointer to left
        int mid = 0;        //pointer for current element;
        int high = n-1;     //pointer to right
        while(mid <= high) {

            //if current element is 1 move to left
            if(nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            //if current element is 2 move to right
            else if(nums[mid] == 1){
                //mid is in correct position
                mid++;
            }
            else  {
            //if(nums[i]==2)
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
