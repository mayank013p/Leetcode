class Solution {
    public int divide(int dividend, int divisor) {
         if(dividend==-2147483648 && divisor ==-1) {
            return Integer.MAX_VALUE;
         }
        int ans = dividend/divisor;
        return ans;
    }
}