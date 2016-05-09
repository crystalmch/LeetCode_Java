public class Solution {
    public String longestCommonPrefix(String[] strs) {
		int len = strs.length;
		if (len == 0) {
			return "";
		}
		if (len == 1) {
			return strs[0];
		}
		int min = strs[0].length();
		String min_str = strs[0];
		for (int i = 0; i < len; i++) {
			int j = strs[i].length();
			if (j < min) {
				min = j;
				min_str = strs[i].substring(0, j);
			}
		}
		for (int i = 0; i < len;) {
			int sub = min_str.length();
			String temp = strs[i].substring(0, sub);
			if (!temp.equals(min_str)) {
				if (sub > 1) {
					sub--;
					min_str = min_str.substring(0, sub);
				} else {
					return "";
				}
			} else {
				i++;
			}
		}
		return min_str;      
    }
}