import java.util.Arrays;

public class Solution {
	public int firstMissingPositive(int[] nums) {
		int len = nums.length;
		int res = 0;
		Arrays.sort(nums);
		int j = 0;
		for (int i = 0; i < len; i++) {
			if ((i > 0) && (nums[i] == nums[i - 1])) {
			} else if (nums[i] > 0) {
				j++;
				if (j != nums[i]) {
					res = j;
					break;
				}
			}
		}
		if (res == 0) {
			res = (j == 0) ? 1 : j + 1;
		}
		return res;
	}
}