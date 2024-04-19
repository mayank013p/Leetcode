class Solution {
    public int ans[];
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){
            for(int r = i+1; r < nums.length; r++){
                if(nums[i]+nums[r] == target){
                    int ans[] = {i, r};
                    return ans;
                }
            }
        }
        return ans;        
    }
}