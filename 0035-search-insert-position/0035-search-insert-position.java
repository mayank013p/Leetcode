class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){
            if(target == nums[i]){
                return i;
            }
        }
        for(int j = 0;j<nums.length;j++){
            if(nums[j]>=target){
                return j;
            }else if(j==nums.length-1){
                return j+1;
            }
        }
        return 0;
        
    }
}