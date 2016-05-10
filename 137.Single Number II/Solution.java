public class Solution {
	public int singleNumber(int[] nums) {
		int len = nums.length;
		if (len < 3)
			return nums[0];
		Arrays.sort(nums);
		int index = -1;
		for (int i = 1; i < len; i += 3) {
			if (nums[i - 1] != nums[i]) {
				index = i - 1;
				break;
			}
		}
		if (index < 0)
			index = len - 1;
		return nums[index];
	}
}