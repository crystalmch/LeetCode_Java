import java.util.HashMap;

public class Solution {
    public boolean isAnagram(String s, String t) {
        int s_len = s.length();
        int t_len = t.length();
        if(s_len != t_len) return false;
        
        HashMap<Character, Integer> table = new HashMap<Character, Integer>();
        for(int i=0;i<s_len;i++){
            char si = s.charAt(i);
            char ti = t.charAt(i);
            int count = 0;
            if(!table.containsKey(si)){
                table.put(si,1);
            }else{
                count = table.get(si);
                count++;
                table.put(si,count);
            }
            if(!table.containsKey(ti)){
                table.put(ti,-1);
            }else{
                count = table.get(ti);
                count--;
                table.put(ti,count);
            }
        }
        for(char key:table.keySet()){
            if(table.get(key)!=0){
                return false;
            }
        }
        return true;
    }
}