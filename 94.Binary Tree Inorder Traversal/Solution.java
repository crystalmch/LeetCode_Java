public class Solution {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> curr = new ArrayList<Integer>();

		if (root == null)
			return curr;
		Solution sol = new Solution();
		if (root.left != null) {
			List<Integer> lleft = sol.inorderTraversal(root.left);
			curr.addAll(lleft);
		}
		curr.add(root.val);

		if (root.right != null) {
			List<Integer> lright = sol.inorderTraversal(root.right);
			curr.addAll(lright);
		}

		return curr;
	}
}