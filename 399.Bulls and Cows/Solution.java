import java.util.Arrays;

public class Solution {
	public String getHint(String secret, String guess) {
		int bull = 0;
		int cow = 0;
		char[] sr = secret.toCharArray();
		char[] tr = guess.toCharArray();
		int len = sr.length;
		for (int i = 0; i < len; i++) {
			if (sr[i] == tr[i])
				bull++;
		}
		Arrays.sort(tr);
		Arrays.sort(sr);
		for (int j = 0, k = 0; (j < len) && (k < len);) {
			if (sr[j] < tr[k]) {
				j++;
			} else if (sr[j] > tr[k]) {
				k++;
			} else {
				j++;
				k++;
				cow++;
			}
		}
		cow -= bull;
		String t = Integer.toString(bull) + "A" + Integer.toString(cow) + "B";
		return t;
	}
}