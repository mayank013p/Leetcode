class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean vis[] = new boolean[n];

        for(int i = 0; i< n;i++){
            if(nums[i] > 0 && nums[i] <= n){
                vis[nums[i]-1] = true;
            }
        }
        for(int i = 0;i<n;i++){
            if(!vis[i]){
                return i+1;
            }
        }
        return n+1;
    }
}