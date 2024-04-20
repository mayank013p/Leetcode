class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0 ;
        int n = columnTitle.length();
        for(int i = 0;i<columnTitle.length();i++){
            int inth = i+1;
            int ci = (int)columnTitle.charAt(i);
            ans += (ci-64)*(Math.pow(26,n-inth));
        }
        return ans;
    }
}