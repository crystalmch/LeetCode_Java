import java.util.Arrays;

public class Solution {
	public int rob(int[] nums) {
		int len = nums.length;
		int sum = 0;
		int max = 0;
		if (len <= 3) {
			switch (len) {
			case 3:
				if (nums[1] > (nums[0] + nums[2])) {
					max = nums[1];
				} else {
					max = nums[0] + nums[2];
				}
				break;
			case 2:
				if (nums[0] > nums[1]) {
					max = nums[0];
				} else {
					max = nums[1];
				}
				break;
			case 1:
				max = nums[0];
				break;
			}
		} else {
			for (int i = len / 2 - 1; i < len / 2 + 2; i++) {
				sum = nums[i];
				Solution sol = new Solution();
				if (i > 1) {
					int[] left = Arrays.copyOfRange(nums, 0, i - 1);
					sum += sol.rob(left);
					System.out.println(nums[i] + " left " + "0 to " + (i - 2));
				}
				if (i < len - 2) {
					int[] right = Arrays.copyOfRange(nums, i + 2, len);
					sum += sol.rob(right);
				}
				if (sum > max)
					max = sum;
			}
		}
		return max;
	}
}