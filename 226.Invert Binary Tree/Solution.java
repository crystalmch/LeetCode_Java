public class Solution {
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp;
        Solution sol = new Solution();
        if (root == null)
            return root;
        if ((root.left != null) && (root.right != null)) {
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            root.left = sol.invertTree(root.left);
            root.right = sol.invertTree(root.right);
        } else if (root.left != null) {
            root.right = root.left;
            root.left = null;
            root.right = sol.invertTree(root.right);
        } else if (root.right != null) {
            root.left = root.right;
            root.right = null;
            root.left = sol.invertTree(root.left);
        }
        return root;
    }
}