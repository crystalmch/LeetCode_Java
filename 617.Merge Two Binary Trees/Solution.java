public class Solution {
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		boolean r1 = (t1 == null);
		boolean r2 = (t2 == null);

		if (r1 && r2)
			return null;
		if (r1 && (!r2))
			return t2;
		if ((!r1) && r2)
			return t1;

		Solution sol = new Solution();
		TreeNode ret = new TreeNode(t1.val + t2.val);
		ret.left = sol.mergeTrees(t1.left, t2.left);
		ret.right = sol.mergeTrees(t1.right, t2.right);
		return ret;
	}
}
