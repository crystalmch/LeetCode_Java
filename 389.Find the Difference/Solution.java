public class Solution {
    public char findTheDifference(String s, String t) {
        int l = t.length();
        int i = 0;
        char[] sr = s.toCharArray();
        char[] tr = t.toCharArray();
        Arrays.sort(sr);
        Arrays.sort(tr);
        for(; i < l - 1; i++){
            if(sr[i] != tr[i]) break;
        }
        return tr[i];
    }
}