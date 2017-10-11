import java.util.Arrays;

class Solution {
	public int findMaxConsecutiveOnes(int[] nums) {
		int pos = -1;
		int len = 0;
		int max = 0;
		int[] append = Arrays.copyOf(nums, nums.length + 1);
		append[nums.length] = 0;
		for (int i = 0; i < append.length; i++) {
			if (append[i] == 0) {
				len = i - pos - 1;
				pos = i;
				if (len > max) {
					max = len;
				}
			}
		}
		return max;
	}
}