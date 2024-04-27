class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for(int j = 0;j<accounts.length;j++){
            int sum = 0;
            for(int element : accounts[j]){
            sum += element;
            }
            if(sum >= ans){
                ans = sum;
            }
            
        }
        return ans;
    }
}