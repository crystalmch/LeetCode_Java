import java.util.Arrays;

class Solution {
	public int findUnsortedSubarray(int[] nums) {
		int[] temp = Arrays.copyOf(nums, nums.length);
		Arrays.sort(temp);
		int i = 0;
		int j = nums.length - 1;
		for (; i < nums.length; i++) {
			if (nums[i] != temp[i])
				break;
		}
		for (; j >= i; j--) {
			if (nums[j] != temp[j])
				break;
		}
		return (j - i + 1);
	}
}