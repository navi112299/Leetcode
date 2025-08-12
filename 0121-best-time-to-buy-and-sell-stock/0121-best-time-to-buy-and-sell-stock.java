class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int maxProfit = 0;
        while(sell<prices.length){
            int currentProfit = prices[sell]-prices[buy];
            if(prices[buy]<prices[sell]){
                maxProfit = Math.max(currentProfit, maxProfit);
            }
            else{
                buy=sell;
            }
            sell++;
        }
        return maxProfit;
        
    }
}