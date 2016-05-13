public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null)
			return result;
		List<Integer> row = new ArrayList<Integer>();
		row.add(root.val);
		result.add(0, row);
		Solution sol = new Solution();
		List<List<Integer>> ltree = new ArrayList<List<Integer>>();
		List<List<Integer>> rtree = new ArrayList<List<Integer>>();
		if ((root.left != null) && (root.right != null)) {
			ltree = sol.levelOrderBottom(root.left);
			rtree = sol.levelOrderBottom(root.right);
			int lsize = ltree.size();
			int rsize = rtree.size();
			int max = (lsize > rsize) ? lsize : rsize;
			for (int i = 0; i < max; i++) {
				List<Integer> part = new ArrayList<Integer>();
				if (i < lsize)
					part.addAll(ltree.get(lsize - i - 1));
				if (i < rsize)
					part.addAll(rtree.get(rsize - i - 1));
				result.add(0, part);
			}
		} else if (root.left != null) {
			ltree = sol.levelOrderBottom(root.left);
			result.addAll(0, ltree);
		} else if (root.right != null) {
			rtree = sol.levelOrderBottom(root.right);
			result.addAll(0, rtree);
		}
		return result;        
    }
}