import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int firstUniqChar(String s) {
         char[] list = s.toCharArray();
         int len = s.length();
         HashMap<Character, Integer> wordcount = new HashMap<Character, Integer>();
         for(int i = 0; i < len; i++){
            Character word = new Character(s.charAt(i));
            if (wordcount.containsKey(word)) {
                wordcount.put(word, wordcount.get(word) + 1);
            } else {
                wordcount.put(word, 1);
            }
         }
         for(int j = 0; j < len; j++){
             Character temp = new Character(s.charAt(j));
             if(wordcount.get(temp) == 1){
                 return j;
             }
         }
         return -1;
    }
}