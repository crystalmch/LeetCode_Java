public class Solution {
	public int rangeBitwiseAnd(int m, int n) {
		if (m <= 0)
			return 0;
		int low = (int) (Math.log(m) / Math.log(2.0d));
		int high = (int) (Math.log(n) / Math.log(2.0d));
		if (low != high)
			return 0;
		if (m == n)
			return m;
		int res = (int) Math.pow(2, low);
		Solution sol = new Solution();
		low = m - res;
		high = n - res;
		res += sol.rangeBitwiseAnd(low, high);
		return res;
	}
}
