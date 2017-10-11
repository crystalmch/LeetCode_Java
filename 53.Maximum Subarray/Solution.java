import java.util.Arrays;

class Solution {
	public int maxSubArray(int[] nums) {
		int sum = 0, m = 0;
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			if (sum < 0) {
				m++;
				sum = 0;
			} else {
				res = Math.max(res, sum);
			}
		}
		if (m == nums.length) {
			Arrays.sort(nums);
			return nums[m - 1];
		}
		return res;
	}
}