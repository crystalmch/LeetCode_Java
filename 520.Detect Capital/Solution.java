class Solution {
	public boolean detectCapitalUse(String word) {
		int len = word.length();
		boolean flag = false;
		if (len < 2)
			return true;
		if (word.charAt(1) < 91) {
			for (int i = 0; i < len; i++) {
				if (word.charAt(i) > 96)
					return flag;
			}
		} else {
			for (int i = 1; i < len; i++) {
				if (word.charAt(i) < 91)
					return flag;
			}
		}
		flag = true;
		return flag;
	}
}