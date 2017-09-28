import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public String[] findWords(String[] words) {
		String line_1 = "qwertyuiop";
		String line_2 = "asdfghjkl";
		String line_3 = "zxcvbnm";
		ArrayList<String> ret = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			char[] temp = words[i].toCharArray();
			int len = temp.length;
			for (int j = 0; j < len; j++) {
				char c = temp[j];
				if (c < 91)
					c = (char) (c + 32);
				if (line_1.indexOf(c) >= 0) {
					temp[j] = 'q';
				} else if (line_2.indexOf(c) >= 0) {
					temp[j] = 'a';
				} else if (line_3.indexOf(c) >= 0) {
					temp[j] = 'z';
				} else {
					temp[j] = '0';
					break;
				}
			}
			Arrays.sort(temp);
			if (temp[0] == temp[len - 1])
				ret.add(words[i]);
		}
		return ret.toArray(new String[ret.size()]);
	}
}
