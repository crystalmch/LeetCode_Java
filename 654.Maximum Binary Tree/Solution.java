import java.util.*;

public class Solution {
	public TreeNode constructMaximumBinaryTree(int[] nums) {
		int len = nums.length;
		Solution sol = new Solution();
		if (len == 0)
			return null;
		if (len == 1) {
			TreeNode max = new TreeNode(nums[0]);
			return max;
		} else {
			int idx = 0;
			for (int i = 1; i < len; i++) {
				if (nums[i] > nums[idx])
					idx = i;
			}
			TreeNode max = new TreeNode(nums[idx]);
			if (idx > 0) {
				int[] l = Arrays.copyOfRange(nums, 0, idx);
				max.left = sol.constructMaximumBinaryTree(l);
			}
			if (idx < len) {
				int[] r = Arrays.copyOfRange(nums, idx + 1, len);
				max.right = sol.constructMaximumBinaryTree(r);
			}
			return max;
		}
	}
}
