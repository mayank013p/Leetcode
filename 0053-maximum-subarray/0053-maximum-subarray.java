class Solution {
    public int maxSubArray(int[] nums) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        
        for(int i : nums){
            cs = Math.max(i,cs+i);
            ms = Math.max(ms,cs);
        }
        return ms;

    }
}