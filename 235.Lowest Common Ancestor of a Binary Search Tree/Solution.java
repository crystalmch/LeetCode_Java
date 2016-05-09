public class Solution {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null)
			return null;
		if ((root.val == p.val) || (root.val == q.val))
			return root;
		TreeNode curr = root;
		Solution sol = new Solution();
		if (p.val < q.val) {
			if ((p.val < root.val) && (q.val > root.val))
				return root;
			if (q.val < root.val)
				curr = sol.lowestCommonAncestor(root.left, p, q);
			if (p.val > root.val)
				curr = sol.lowestCommonAncestor(root.right, p, q);
		} else {
			if ((q.val < root.val) && (p.val > root.val))
				return root;

			if (p.val < root.val)
				curr = sol.lowestCommonAncestor(root.left, p, q);
			if (q.val > root.val)
				curr = sol.lowestCommonAncestor(root.right, p, q);
		}
		return curr;
	}
}