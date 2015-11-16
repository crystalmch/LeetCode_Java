public class Solution {
    public boolean isUgly(int num) {
        Solution sol = new Solution();
        if(num <= 0) return false;
        if(num == 1) return true;
        if(num%2 == 0){
            num = num/2;
            return sol.isUgly(num);
        }else if(num%3 == 0){
            num = num/3;
            return sol.isUgly(num);
        }else if(num%5 == 0){
            num = num/5;
            return sol.isUgly(num);
        }
        return false;
    }
}