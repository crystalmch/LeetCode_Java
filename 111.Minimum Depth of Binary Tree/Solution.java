public class Solution {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int minDepth(TreeNode root) {
		int count = 1;
		if (root == null)
			return 0;
		if ((root.left == null) && (root.right == null)) {
			return 1;
		} else {
			Solution sol = new Solution();
			int m = 0;
			int n = 0;
			if (root.left != null) {
				m = sol.minDepth(root.left);
			}
			if (root.right != null) {
				n = sol.minDepth(root.right);
			}
			if (m * n == 0) {
				count += (m + n);
			} else if (m < n) {
				count += m;
			} else {
				count += n;
			}
		}
		return count;
	}
}