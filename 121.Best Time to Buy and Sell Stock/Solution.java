public class Solution {
    public int maxProfit(int[] prices) {
		int len = prices.length;
		if (len < 2)
			return 0;
		int max = prices[0];
		int min = prices[0];
		int diff = 0;
		for (int i = 0; i < len; i++) {
			if (prices[i] > max) {
				max = prices[i];
				if (diff < (max - min)) {
					diff = max - min;
				}
			}

			if (prices[i] < min) {
				min = prices[i];
				max = prices[i];
			}
		}
		return diff;
    }
}