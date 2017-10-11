import java.util.Arrays;

class Solution {
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length;
		int n = nums[0] * nums[1];
		int p = nums[len - 2] * nums[len - 3];
		return Math.max(nums[len - 1] * p, nums[len - 1] * n);
	}
}