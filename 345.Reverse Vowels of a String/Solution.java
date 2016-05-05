public class Solution {
    public String reverseVowels(String s) {
		Character[] pattern = { 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u',
				'U' };
		char[] str = s.toCharArray();
		int count = 0;
		int first = -1;
		int last = s.length();

		for (char ch : str) {
			if(first >= last) break;
			if ((Arrays.asList(pattern).contains(ch))) {
				first = count;
				for (int j = last - 1; j > first; j--) {
					char temp = s.charAt(j);
					if (Arrays.asList(pattern).contains(temp)) {						
						last = j;
						str[first] = str[last];
						str[last] = ch;
						break;
					}
				}
			}
			count++;
		}
		String res = new String(str);
		return res;
    }
}