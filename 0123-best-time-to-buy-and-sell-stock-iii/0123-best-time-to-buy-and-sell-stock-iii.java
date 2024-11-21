class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        
        int n = prices.length;
        
        int firstBuy = Integer.MAX_VALUE, firstProfit = 0;
        int secondBuy = Integer.MAX_VALUE, secondProfit = 0;
        
        for (int i = 0; i < n; i++) {
            firstBuy = Math.min(firstBuy, prices[i]);
            firstProfit = Math.max(firstProfit, prices[i] - firstBuy);
            
            secondBuy = Math.min(secondBuy, prices[i] - firstProfit);
            secondProfit = Math.max(secondProfit, prices[i] - secondBuy);
        }
        
        return secondProfit;
    }
}
