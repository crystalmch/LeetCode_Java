public class Solution {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	TreeNode ptemp=p;
    	TreeNode qtemp=q;
        if((ptemp==null)&&(qtemp==null)){
        	return true;
        }
        else{
        	if((ptemp!=null)&&(qtemp!=null)){
        		boolean lsame=isSameTree(ptemp.left,qtemp.left);
        		boolean rsame=isSameTree(ptemp.right,qtemp.right);
        		if((ptemp.val==qtemp.val)&&lsame&&rsame) return true;
        		else return false;
        	}	
        	else 
        		return false;
        }
    }
}
