public class Solution {
	public int integerBreak(int n) {
		int res = 1;
		int div = n / 3;
		if (n < 4)
			return n - 1;
		if (n % 3 == 0) {
			res = (int) Math.pow(3, div);
		} else if (n % 3 == 1) {
			res = 4 * (int) Math.pow(3, div - 1);
		} else {
			if (n != 2) {
				res = 2 * (int) Math.pow(3, div);
			}
		}
		return res;
	}
}