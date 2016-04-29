import java.util.*;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> matrix = new ArrayList<List<Integer>>();
		List<Integer> sub = new ArrayList<Integer>();

		for (int i = 1; i <= numRows; i++) {
			if (i > 2) {
				Integer[] temp_sub = sub.toArray(new Integer[sub.size()]);
				for (int j = 1; j < i - 1; j++) {
					int res = temp_sub[j - 1] + temp_sub[j];
					sub.set(j, Integer.valueOf(res));
				}
			}
			sub.add(Integer.valueOf(1));
			List<Integer> row = new ArrayList<Integer>(sub);	//！！！！！！！
			matrix.add(row);
		}
		return matrix;
    }
}