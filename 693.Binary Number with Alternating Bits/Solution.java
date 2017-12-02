class Solution {
	public boolean hasAlternatingBits(int n) {
		String bin = Integer.toBinaryString(n);
		for (int i = 1; i < bin.length(); i++) {
			char last = bin.charAt(i - 1);
			if (bin.charAt(i) == last) {
				return false;
			}
		}
		return true;
	}
}
