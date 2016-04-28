public class Solution {
    public boolean canWinNim(int n) {
        int m = n % 4;
        if(m == 0) return false;
        return true;
    }
}