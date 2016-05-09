public class Solution {
    public boolean wordPattern(String pattern, String str) {
		int len = pattern.length();
		int index = str.length();
		int i = 0;
		int j = 0;
		int space = 0;
		String[] test = new String[len];
		HashMap<Character, String> hash = new HashMap<Character, String>();
		while ((i < index) && (j < len)) {
			if ((str.charAt(i) == ' ') || (i == index - 1)) {
				if (i == index - 1) {
					test[j] = str.substring(space);
				} else {
					test[j] = str.substring(space, i);
				}
				char key = pattern.charAt(j);
				if (hash.containsKey(key)) {
					if (!hash.get(key).equals(test[j]))
						return false;
				} else if (hash.containsValue(test[j])) {
					return false;
				} else {
					hash.put(key, test[j]);
				}
				space = i + 1;
				j++;
			}
			i++;
		}
		if ((i != index) || (j != len))
			return false;
		return true;    
    }
}