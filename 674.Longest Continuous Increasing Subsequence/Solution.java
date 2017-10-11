class Solution {
	public int findLengthOfLCIS(int[] nums) {
		int count = 1;
		int res = 0;
		if (nums.length == 0)
			return res;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1]) {
				count++;
			} else {
				res = Math.max(count, res);
				count = 1;
			}
		}
		return Math.max(count, res);
	}
}