public class Solution {
    public boolean isSubsequence(String s, String t) {
		int len = s.length();
		String init = t;
		for(int i = 0; i < len; i++){
			char temp = s.charAt(i);
			int pos = init.indexOf(temp);
			if(pos != -1){
				init = init.substring(pos + 1);
			}else{
				return false;
			}
		}
		return true;
    }
}