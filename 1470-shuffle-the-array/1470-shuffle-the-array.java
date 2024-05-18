class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] number = new int[n*2];
        for(int x = 0; x<n ;x++){
            number[2*x] = nums[x];
            number[2*x+1] = nums[n+x];
        }
        return number;
    }
}