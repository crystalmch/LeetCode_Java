import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> generateParenthesis(int n) {
		List<String> rest = new ArrayList<String>();
		Solution sol = new Solution();
		if (n > 1) {
			for (int i = 1; i <= n / 2; i++) {
				List<String> a = sol.generateParenthesis(i);
				List<String> b = sol.generateParenthesis(n - i);
				int as = a.size();
				int bs = b.size();
				for (int k = 0; k < bs; k++) {
					if (i == 1) {
						String mid = "(" + b.get(k) + ")";
						if (!rest.contains(mid))
							rest.add(mid);
					}
					for (int j = 0; j < as; j++) {
						String temp_1 = a.get(j) + b.get(k);
						String temp_2 = b.get(k) + a.get(j);
						if (!rest.contains(temp_1))
							rest.add(temp_1);
						if (!rest.contains(temp_2))
							rest.add(temp_2);
					}
				}
			}
		} else if (n == 1) {
			rest.add("()");
		} else {
			rest.add("");
		}
		return rest;
	}
}