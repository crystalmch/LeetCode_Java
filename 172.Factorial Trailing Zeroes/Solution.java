public class Solution {
	public int trailingZeroes(int n) {
		int temp = n;
		int res = 0;
		while (temp >= 5) {
			temp = temp / 5;
			res += temp;
		}
		return res;
	}
}