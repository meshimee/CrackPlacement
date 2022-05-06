public class Prblm_121 {
        
        public static int maxProfit_Naive(int[] prices) {
	        int profit = 0;
		    for(int i = 0; i < prices.length; i++) {
			for(int j = i + 1; j < prices.length; j++) {
				profit = Math.max(profit, prices[j] - prices[i]);
			}
		}
		return profit;
	}
          public static int maxProfit(int[] prices) {
                    int maxProfit = 0;
                    int minSoFar = prices[0];
                    
                    for(int i =0; i<prices.length;i++){
                        minSoFar = Math.min(minSoFar,prices[i]);
                        int profit = prices[i]-minSoFar;
                        maxProfit = Math.max(maxProfit,profit);
                    }
                    return maxProfit;
          }
          public static void main(String[] args) {
                    int[] prices = {7,1,5,3,6,4};
                    int ans = maxProfit(prices);
                    System.out.println(ans);
          }
}
