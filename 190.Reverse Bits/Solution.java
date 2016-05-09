public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
		String s = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
		String r = new StringBuilder(s).reverse().toString();
		long temp = Long.parseLong(r, 2);
		return (int) temp;       
    }
}