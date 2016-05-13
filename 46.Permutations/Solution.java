public class Solution {
    public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		int len = nums.length;
		if (len == 0)
			return res;
		int end = nums[0];
		if (len == 1) {
			List<Integer> row = new ArrayList<Integer>();
			row.add(end);
			res.add(row);
		} else {
			Solution sol = new Solution();
			List<List<Integer>> pre = sol.permute(Arrays.copyOfRange(nums, 1, len));
			for (List<Integer> row : pre) {
				for (int i = 0; i < len; i++) {
					List<Integer> temp = new ArrayList<Integer>(row);
					temp.add(i, end);
					res.add(temp);
				}
			}
		}
		return res;        
    }
}