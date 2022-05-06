public class Prblm_122 {
          public static int maxProfit(int[] prices) {
                    return getMaxProfit(prices, 0, prices.length - 1);
                }
          public static int getMaxProfit (int[] prices, int start, int end) {
		if (start >= end) {
			return 0;
		}
		int profit = 0, currentProfit = 0;
		for (int i = start; i <= end; i++) {
			for (int j = i + 1; j <= end; j++) {
				if (prices[j] > prices[i]) {
					currentProfit = prices[j] - prices[i] + getMaxProfit(prices, start, i - 1) + getMaxProfit(prices, j + 1, end);
				}
				profit = Math.max(profit, currentProfit);
			}
		}
		return profit;

	}
	
          public static void main(String[] args) {
                    int[] prices = {7,1,5,3,6,4};
                    int start = 0;
                    int end = prices.length-1;
                    int ans = getMaxProfit(prices, start, end);
                    System.out.println(ans);
          }
}

