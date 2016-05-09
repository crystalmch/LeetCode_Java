public class Solution {
    public String convertToTitle(int n) {
		int temp = n;
		String result = "";
		while (temp > 0) {
			temp = temp - 1;
			char digit = (char) ('A' + temp % 26);
			result = digit + result;
			temp = temp / 26;
		}
		return result;    
    }
}