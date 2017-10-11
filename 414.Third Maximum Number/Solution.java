import java.util.Arrays;

class Solution {
	public int thirdMax(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length;
		int count = 1;
		int res = nums[len - 1];
		if (len < 3)
			return res;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] == nums[i + 1])
				continue;
			count++;
			if (count == 3)
				return nums[i];
		}
		return res;
	}
}