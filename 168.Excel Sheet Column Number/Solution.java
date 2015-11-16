/*
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * 
 */
public class Solution {
	public int titleToNumber(String s) {
		int len = s.length();
		int result = 0;
		for (int i = len, j = 0; i != 0; i--, j++) {
			int temp = s.charAt(j) - 'A' + 1;
			result += temp * Math.pow(26, (i - 1));
		}
		return result;
	}
}