class Solution {
    public void sortColors(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(nums[i] < nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        // Arrays.sort(nums);
        for(int p = 0;p<nums.length;p++){
            System.out.println(nums[p]);
        }
    }
}