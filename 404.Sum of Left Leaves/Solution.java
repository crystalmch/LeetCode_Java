/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int count = 0;
        Solution sol = new Solution();
        if(root != null){
            TreeNode l = root.left;
            TreeNode r = root.right;
            if((l != null) && (l.left == null) && (l.right == null)){
                count += l.val;
            }
            count += sol.sumOfLeftLeaves(l) + sol.sumOfLeftLeaves(r);
        }
        return count;
    }
}