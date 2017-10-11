import java.util.Arrays;

class Solution {
	public int findPairs(int[] nums, int k) {
		int len = nums.length;
		Arrays.sort(nums);
		int temp = -1;
		int count = 0;
		if ((k < 0) || (len == 0))
			return count;
		int res = nums[0] - 1;
		for (int i = 0; i < len; i++) {
			if (k == 0) {
				if (nums[i] == res) {
					continue;
				} else if ((i > 0) && (nums[i - 1] == nums[i])) {
					res = nums[i];
					count++;
				}
			} else {
				if ((i > 0) && (nums[i - 1] == nums[i]))
					continue;
				temp = Arrays.binarySearch(nums, nums[i] + k);
				if (temp > 0)
					count++;
			}
		}
		return count;
	}
}