import java.util.*;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> element = new ArrayList<>();
        String r = "Fizz";
        String s = "Buzz";
        for(int i = 1; i <= n ; i++){
            String temp = "";
            if(i%3 == 0) temp += r;
            if(i%5 == 0) temp += s;
            if(temp == "") temp += Integer.toString(i);
            element.add(temp);
        }
        return element;
    }
}