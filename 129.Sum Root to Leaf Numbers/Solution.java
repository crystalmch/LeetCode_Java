import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> pathNumbers(TreeNode root) {
		List<String> num = new ArrayList<String>();
		char c = (char) ('0' + root.val);
		if ((root.left != null) || (root.right != null)) {
			Solution sol = new Solution();
			if (root.left != null) {
				List<String> ltree = sol.pathNumbers(root.left);
				for (String l : ltree) {
					String temp = c + l;
					num.add(temp);
				}
			}
			if (root.right != null) {
				List<String> rtree = sol.pathNumbers(root.right);
				for (String r : rtree) {
					String temp = c + r;
					num.add(temp);
				}
			}
		} else {
			num.add(Character.toString(c));
		}
		return num;
	}

	public int sumNumbers(TreeNode root) {
		if (root == null)
			return 0;
		Solution sol = new Solution();
		int sum = 0;
		List<String> res = sol.pathNumbers(root);
		for (String s : res) {
			sum += Integer.parseInt(s);
		}
		return sum;
	}
}