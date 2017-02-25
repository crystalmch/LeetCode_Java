public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] source = magazine.toCharArray();
        Arrays.sort(source);
        int m = source.length;
        char[] note = ransomNote.toCharArray();
        Arrays.sort(note);
        int n = note.length;
        int i = 0;
        int j = 0;
        for(; (i < m)&&(j < n); i++){
            if(source[i] == note[j]){
                j++;
            }else if(source[i] < note[j]){
                continue;
            }else{
                return false;
            }
        }
        if((n > m)||(j != n)) return false;
        return true;
    }
}