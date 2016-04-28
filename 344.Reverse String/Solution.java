import java.util.*;

public class Solution {
    public String reverseString(String s) {
        int i, len = s.length();
        StringBuilder dest = new StringBuilder(len);

        if(len == 0) return "";
        
        for (i = (len - 1); i >= 0; i--){
            dest.append(s.charAt(i));
        }

        return dest.toString();
    }
}