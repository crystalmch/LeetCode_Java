public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n < 1){
            return 1;
        }
        
        int ans = 1;
        int multiple = 9;
        for (int i = n - 1; i >= 0; i--) {
            if (i == 0) {
                ans += multiple;
            } else {
                ans += (n - i + 1) * multiple;
            }
            multiple = multiple * (10 - n + i - 1);
        }
        return ans;
    }
}