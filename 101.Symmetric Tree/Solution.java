public class Solution {
	public TreeNode invertTree(TreeNode root) {
		if (root == null)
			return root;
		TreeNode temp = root;
		Solution sol = new Solution();
		if ((temp.left != null) && (temp.right != null)) {
			TreeNode mid = temp.left;
			temp.left = temp.right;
			temp.right = mid;
			temp.left = sol.invertTree(temp.left);
			temp.right = sol.invertTree(temp.right);
		} else if (temp.left != null) {
			temp.right = temp.left;
			temp.left = null;
			temp.right = sol.invertTree(temp.right);
		} else if (temp.right != null) {
			temp.left = temp.right;
			temp.right = null;
			temp.left = sol.invertTree(temp.left);
		}
		return root;
	}

	public boolean isIdentical(TreeNode a, TreeNode b) {
		Solution sol = new Solution();
		boolean l = false;
		boolean r = false;
		if ((a == null) && (b == null))
			return true;
		if (a.val == b.val) {
			if ((a.left != null) && (b.left != null)) {
				l = sol.isIdentical(a.left, b.left);
			} else if ((a.left == null) && (b.left == null)) {
				l = true;
			} else {
				l = false;
			}

			if ((a.right != null) && (b.right != null)) {
				if (a.right.val == b.right.val)
					r = sol.isIdentical(a.right, b.right);
				else
					r = false;
			} else if ((a.right == null) && (b.right == null)) {
				r = true;
			} else {
				r = false;
			}
		}
		return r && l;
	}

	public boolean isSymmetric(TreeNode root) {
		Solution sol = new Solution();
		if (root == null)
			return true;
		if ((root.left != null) && (root.right != null)) {
			root.right = sol.invertTree(root.right);
			return sol.isIdentical(root.left, root.right);

		} else if ((root.left == null) && (root.right == null)) {
			return true;
		}
		return false;
	}
}