import java.util.Arrays;

public class Solution {
	public boolean canJump(int[] nums) {
		int[] check = nums.clone();
		Arrays.sort(check);
		if (check[0] != 0)
			return true;
		int index = nums.length - 1;
		if (index == 0) {
			return true;
		} else {
			for (int i = index - 1; i >= 0; i--) {
				if ((i - index + nums[i]) >= 0) {
					Solution sol = new Solution();
					return sol.canJump(Arrays.copyOf(nums, i + 1));
				}
			}
		}
		return false;
	}
}