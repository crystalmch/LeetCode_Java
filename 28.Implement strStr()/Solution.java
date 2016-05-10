public class Solution {
	public int strStr(String haystack, String needle) {
		int m = haystack.length();
		int n = needle.length();
		String ending = "\0";
		int offset = -1;
		if ((m >= n) && (n > 0)) {
			if (haystack.substring(m - 1).equals(ending)) {
				m--;
				haystack = haystack.substring(0, m);
			}
			if (needle.substring(n - 1).equals(ending)) {
				n--;
				needle = needle.substring(0, n);
			}
			System.out.println(n);
			if (haystack.contains(needle)) {
				for (int i = 0; i <= m - n; i++) {
					String temp = haystack.substring(i, i + n);
					if (temp.equals(needle)) {
						offset = i;
						break;
					}
				}
			}
		} else if (n == 0) {
			offset = 0;
		}
		return offset;
	}
}