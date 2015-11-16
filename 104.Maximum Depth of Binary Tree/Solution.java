public class Solution {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
    public int maxDepth(TreeNode root) {
    	TreeNode temp=root;
    	if(temp==null) return 0;
    	else{
    		int lDepth=maxDepth(temp.left);
    		int rDepth=maxDepth(temp.right);
    		if(lDepth>rDepth)
    			return (lDepth+1);
    		else
    			return (rDepth+1);
    	}
    }
}
