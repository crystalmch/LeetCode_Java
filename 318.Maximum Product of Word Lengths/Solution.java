public class Solution {
	public String[] removeDuplicates(String[] words) {
		int size = words.length;
		String[] sorted = new String[size];
		for (int i = 0; i < size; i++) {
			char[] array = words[i].toCharArray();
			Arrays.sort(array);
			int len = words[i].length();
			List<Character> temp = new ArrayList<Character>();
			if (len > 0)
				temp.add(array[0]);
			for (int j = 1; j < len; j++) {
				if (array[j] != array[j - 1])
					temp.add(array[j]);
			}
			StringBuilder builder = new StringBuilder(temp.size());
			for (Character ch : temp) {
				builder.append(ch);
			}
			sorted[i] = builder.toString();
		}
		return sorted;
	}

	public int maxProduct(String[] words) {
		int size = words.length;
		int count = 0;
		if (size < 2)
			return count;
		Solution sol = new Solution();
		String[] word = sol.removeDuplicates(words);
		for (int i = 0; i < size; i++) {
			System.out.println(word[i]);
			int len = word[i].length();
			int k;
			Character[] array = new Character[len];
			for (k = 0; k < len; k++) {
				array[k] = new Character(word[i].charAt(k));
			}
			for (int j = i + 1; j < size; j++) {
				int flag = 1;
				int sublen = word[j].length();
				for (k = 0; k < sublen; k++) {
					if (Arrays.asList(array).contains(word[j].charAt(k))) {
						flag = 0;
						break;
					}
				}
				if (flag == 1) {
					int temp = words[i].length() * words[j].length();
					if (temp > count)
						count = temp;
				}
			}
		}
		return count;
	}
}