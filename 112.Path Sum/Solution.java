public class Solution {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;

		Solution sol = new Solution();
		sum -= root.val;
		if ((root.left != null) && (root.right != null)) {
			if ((sol.hasPathSum(root.left, sum))
					|| (sol.hasPathSum(root.right, sum)))
				return true;
		} else if (root.left != null) {
			if (sol.hasPathSum(root.left, sum))
				return true;
		} else if (root.right != null) {
			if (sol.hasPathSum(root.right, sum))
				return true;
		} else {
			if (sum == 0)
				return true;
		}

		return false;
	}
}