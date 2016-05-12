public class Solution {
	public double myPow(double x, int n) {
		double sign = 1.0;
		double result = 1.0;
		if (x < 0) {
			x = -x;
			if (n % 2 != 0)
				sign = -1.0;
		}

		if (x == result) {
			return result * sign;
		}

		if (n == 0) {
			return 1.0;
		}

		if (Math.log(x) * n < Math.log(2) * (-1074)) {
			return 0.0;
		}

		if (Math.log(x) * n >= 1023) {
			return Double.MAX_VALUE * sign;
		}

		for (int i = 0; i < Math.abs(n); i++) {
			if (n > 0) {
				result *= x;
			} else if (n < 0) {
				result /= x;
			}
		}
		return result * sign;
	}
}