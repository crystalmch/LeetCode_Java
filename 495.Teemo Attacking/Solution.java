class Solution {
	public int findPoisonedDuration(int[] timeSeries, int duration) {
		int res = 0;
		int len = timeSeries.length;
		if (len == 0)
			return res;
		for (int i = 1; i < len; i++) {
			if ((timeSeries[i - 1] + duration) <= timeSeries[i]) {
				res = res + duration;
			} else {
				res = res + timeSeries[i] - timeSeries[i - 1];
			}
		}
		return res + duration;
	}
}