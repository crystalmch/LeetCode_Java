public class Solution {
    public int longestPalindrome(String s) {
      int len = s.length();
      HashMap<Character, Integer> wordcount = new HashMap<Character, Integer>();
      int count = 0;
      int flag = 0;
      for(int i = 0; i < len; i++){
        Character word = new Character(s.charAt(i));
        if (wordcount.containsKey(word)) {
            wordcount.put(word, wordcount.get(word) + 1);
        } else {
            wordcount.put(word, 1);
        }
      }

      for (Character key : wordcount.keySet()){
        int val = wordcount.get(key);
        if(val%2 == 0){
            count += val;
        }else{
            count += (val - 1);
            flag = 1;
        }
      }      
      return count+flag;
    }
}