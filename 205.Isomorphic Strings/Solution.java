import java.util.HashMap;

public class Solution {
	public boolean isIsomorphic(String s, String t) {
		HashMap<Character, Character> hash = new HashMap<Character, Character>();
		char[] sr = s.toCharArray();
		char[] tr = t.toCharArray();
		int len = sr.length;
		for (int i = 0; i < len; i++) {
			if (hash.containsKey(sr[i])) {
				if (hash.get(sr[i]) != tr[i]) {
					return false;
				}
			} else if (hash.containsValue(tr[i])) {
				return false;
			} else {
				hash.put(sr[i], tr[i]);
			}
		}
		return true;
	}
}