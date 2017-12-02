import java.util.ArrayList;
import java.util.List;

class Solution {
	public int calPoints(String[] ops) {
		int sum = 0;
		List<Integer> list = new ArrayList<Integer>();
		String x = null;
		int temp = 0;
		for (int i = 0; i < ops.length; i++) {
			x = ops[i];
			temp = 0;
			if (x.equals("C")) {
				temp = list.get(list.size() - 1);
				list.remove(list.size() - 1);
				sum = sum - temp;
				continue;
			} else if (x.equals("D")) {
				temp = list.get(list.size() - 1) * 2;
			} else if (x.equals("+")) {
				temp = list.get(list.size() - 1) + list.get(list.size() - 2);
			} else {
				temp = Integer.parseInt(x);
			}
			list.add(temp);
			sum = sum + temp;
		}
		return sum;
	}
}