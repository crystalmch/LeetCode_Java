import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null)
			return result;
		List<Integer> row = new ArrayList<Integer>();
		row.add(root.val);
		result.add(row);
		Solution sol = new Solution();
		List<List<Integer>> ltree = new ArrayList<List<Integer>>();
		List<List<Integer>> rtree = new ArrayList<List<Integer>>();
		if ((root.left != null) && (root.right != null)) {
			ltree = sol.levelOrder(root.left);
			rtree = sol.levelOrder(root.right);
			int lsize = ltree.size();
			int rsize = rtree.size();
			int max = (lsize > rsize) ? lsize : rsize;
			for (int i = 0; i < max; i++) {
				List<Integer> part = new ArrayList<Integer>();
				if (i < lsize)
					part.addAll(ltree.get(i));
				if (i < rsize)
					part.addAll(rtree.get(i));
				result.add(part);
			}
		} else if (root.left != null) {
			ltree = sol.levelOrder(root.left);
			result.addAll(ltree);
		} else if (root.right != null) {
			rtree = sol.levelOrder(root.right);
			result.addAll(rtree);
		}
		return result;
	}
}