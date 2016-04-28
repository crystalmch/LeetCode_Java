public class Solution {
    public boolean isPowerOfFour(int num) {
        if(num == 1) return true;
        if (((num & (num - 1)) == 0) && (num % 4 == 0)
				&& ((num % 10 == 6) || (num % 10 == 4)))
			return true;
		return false;
    }
}