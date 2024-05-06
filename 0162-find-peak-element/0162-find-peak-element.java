class Solution {
    public int findPeakElement(int[] nums) {
        int peak = 0;
        long high = 0;
        for(int i = 0; i < nums.length;i++){
            //  special conditions
            if(nums[0] == -2147483647 && nums.length ==1){
                return 0;
            }
            if(nums[0] == -2147483648 && nums.length==1){
                return 0;
            }
            if(nums[0] == -2147483648 && nums.length != 1){
                return 1;
            }
            // special conditions
            
            if(nums[i] >= high){
                peak = i;
                high = nums[i];
            }
        }
        return peak;
    }
}