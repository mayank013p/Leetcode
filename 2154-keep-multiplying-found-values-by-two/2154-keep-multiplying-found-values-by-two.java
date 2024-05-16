class Solution {
    public int findFinalValue(int[] nums, int original) {
        int ans = original;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == ans){
                ans = ans*2;
                ans = findFinalValue(nums, ans);
            }
        }
        return ans;
    }
}