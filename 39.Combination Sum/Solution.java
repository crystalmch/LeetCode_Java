import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> findSum(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Solution sol = new Solution();
		int temp = -1;
		for (int i = candidates.length - 1; i >= 0; i--) {
			if (target >= candidates[i]) {
				temp = i;
				break;
			}
		}
		if (temp >= 0) {
			for (int i = temp; i >= 0; i--) {
				int nt = target - candidates[i];
				if (nt > 0) {
					int[] next = Arrays.copyOf(candidates, i + 1);
					List<List<Integer>> prev = sol.findSum(next, nt);
					for (List<Integer> row : prev) {
						List<Integer> r = new ArrayList<Integer>(row);
						r.add(candidates[i]);
						res.add(r);
					}
				} else {
					List<Integer> r = new ArrayList<Integer>();
					r.add(candidates[i]);
					res.add(r);
				}
			}
		}
		return res;
	}

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		Solution sol = new Solution();
		return sol.findSum(candidates, target);
	}
}