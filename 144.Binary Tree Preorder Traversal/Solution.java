public class Solution {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> curr = new ArrayList<Integer>();
		if (root == null)
			return curr;
		curr.add(root.val);
		Solution sol = new Solution();
		if (root.left != null) {
			List<Integer> lleft = sol.preorderTraversal(root.left);
			curr.addAll(lleft);
		}

		if (root.right != null) {
			List<Integer> lright = sol.preorderTraversal(root.right);
			curr.addAll(lright);
		}
		return curr;
	}
}