class Solution {
    public int maxProfit(int[] prices) {
      if(prices == null) return 0; 

        int maxProfit = 0; 
        int l = 0; //buy date

        for(int r = 1; r < prices.length; r++){
            if(prices[r] < prices[l]){
                l = r; 
            }else{
                maxProfit = Math.max(maxProfit, prices[r] - prices[l]);
            }
        }

     
        return maxProfit;
    }
}
