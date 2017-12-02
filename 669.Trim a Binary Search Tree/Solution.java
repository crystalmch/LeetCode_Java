class Solution {
	public TreeNode trimBST(TreeNode root, int L, int R) {
		if (root == null)
			return null;
		Solution sol = new Solution();
		if (root.val > R) {
			root = sol.trimBST(root.left, L, R);
		} else if (root.val < L) {
			root = sol.trimBST(root.right, L, R);
		}
		if (root == null)
			return null;
		root.left = sol.trimBST(root.left, L, R);
		root.right = sol.trimBST(root.right, L, R);
		return root;
	}
}