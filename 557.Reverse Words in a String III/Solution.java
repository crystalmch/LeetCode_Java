public class Solution {
	public String reverseWords(String s) {
		String[] str = s.split("\\s+");
		int len = str.length;
		String ret = "";
		for (int i = 0; i < len; i++) {
			String temp = new StringBuilder(str[i]).reverse().toString();
			if (i != 0)
				temp = " " + temp;
			ret = ret + temp;
		}
		return ret;
	}
}
