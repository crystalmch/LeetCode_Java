public class Solution {
    public String addBinary(String a, String b) {
		int m = a.length();
		int n = b.length();
		int increment = 0;
		int len = (m > n) ? m : n;
		int dis = m - n;
		String result = "";
		for (int i = len - 1; i >= 0; i--) {
			if (dis > 0) {
				m = a.charAt(i) - '0';
				if (i - dis >= 0) {
					n = b.charAt(i - dis) - '0';
				} else {
					n = 0;
				}
			} else {
				if (i + dis >= 0) {
					m = a.charAt(i + dis) - '0';
				} else {
					m = 0;
				}
				n = b.charAt(i) - '0';
			}

			int c = (m ^ n) ^ increment;
			if (m + n + increment > 1) {
				increment = 1;
			} else {
				increment = 0;
			}
			result = Integer.toString(c) + result;
		}
		if (increment == 1) {
			result = "1" + result;
		}
		return result;        
    }
}