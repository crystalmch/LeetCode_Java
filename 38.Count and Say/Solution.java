public class Solution {
    public String countAndSay(int n) {
		String cur = "1";
		for (int i = 1; i < n; i++) {
			char[] temp = cur.toCharArray();
			int len = cur.length();
			int count = 0;
			StringBuilder builder = new StringBuilder();

			char say = temp[0];
			count = 1;
			for (int j = 1; j < len; j++) {

				if (temp[j] == say) {
					count++;
				} else {
					builder.append(count).append(say);
					say = temp[j];
					count = 1;
				}
			}
			builder.append(count).append(say);
			cur = builder.toString();
		}
		return cur;
    }
}