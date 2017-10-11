class Solution {
	public double findMaxAverage(int[] nums, int k) {
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + nums[i];
		}
		int m = sum;
		for (int j = 0; j < nums.length - k; j++) {
			m = m - nums[j] + nums[j + k];
			sum = Math.max(m, sum);
		}
		return (double) sum / (double) k;
	}
}