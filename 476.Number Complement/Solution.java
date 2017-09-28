import java.lang.*;

public class Solution {
	public int findComplement(int num) {
		if (num == 0)
			return 1;
		int n = (int) (Math.log(num) / Math.log(2)) + 1;
		if (n < 32) {
			return (int) (Math.pow(2, n) - 1 - num);
		} else {
			double temp = (1 + num) / 2;
			temp = Integer.MAX_VALUE - temp;
			return (int) (temp * 2);
		}
	}
}
