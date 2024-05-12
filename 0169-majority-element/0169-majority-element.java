class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int r = 0;
        int other = 0;
        for(int i = 0;i<nums.length;i++){
            int temp = 0;
            for(int j = i; j<nums.length;j++){
                if(nums[j]==nums[i]){
                    temp++;
                    r = nums[j];
                }
            }
            if(temp>ans){
                    ans = temp;
                    other = r;
                }
        }
        return other;
    }
}