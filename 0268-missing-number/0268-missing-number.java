class Solution {
    public int missingNumber(int[] nums) { 
        Arrays.sort(nums);
        if(nums.length == 1 && nums[0]==0){
            int z = nums[0];
            return 1;
        }
        if(nums.length == 1){
            return nums[0]-1;
        }
        int  k = 0;
        for(int i = 1; i<nums.length;i++){
            // int n = nums[k]
            if(nums[i] != nums[k]+1){
                return nums[k]+1;
            }
            k++;
        }
        if(nums[0]== 0){
            return nums[k] + 1;
        }else{
            return nums[0] - 1;
        }
    }
}