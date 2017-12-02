import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	public List<Integer> findDuplicates(int[] nums) {
		Arrays.sort(nums);
		int m = 0;
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				if (m != nums[i]) {
					res.add(nums[i]);
					m = nums[i];
				}
			}
		}
		return res;
	}
}