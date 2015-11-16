import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public int lengthOfLastWord(String s) {
        int s_len = s.length();
        String word = "";
        Pattern pattern = Pattern.compile("[a-zA-Z]*?\\w+");
        Matcher matcher = pattern.matcher(s);
        while(matcher.find()){
            word = matcher.group(0);
        }
        int len = word.length();
        return len;
    }
}