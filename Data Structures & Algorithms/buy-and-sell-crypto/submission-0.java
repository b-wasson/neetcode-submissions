class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = 0; j < prices.length; j++){
                if(i > j){
                    if(prices[i]-prices[j] > maxProfit){
                        maxProfit = prices[i] - prices[j];
                    }
                }
            }

        }
        return maxProfit;
        
    }
}
