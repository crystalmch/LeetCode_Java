public class Solution {
    public int mySqrt(int x) {
        double res = Math.pow(Math.E, (Math.log((double) x) / 2.0));
		double val = (int) res + 1;
		if (val - res < 1E-10) {
			return (int) val;
		} else {
			return (int) res;
		}
    }
}