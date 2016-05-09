public class Solution {
    public int myAtoi(String str) {
		str = str.toUpperCase();
		char[] chr = str.toCharArray();
		int sign = 1;
		int i = 0;
		int len = chr.length;
		int val = 0;
		int type = 10;
		String digits = "0123456789ABCDEF";
		for (; i < len; i++) {
			char temp = chr[i];
			int d = digits.indexOf(temp);
			if ((d >= 0) || (temp == '+') || (temp == '-') || (temp == '.')) {
				break;
			} else if (chr[i] > 33) {
				return 0;
			}
		}

		if (i >= len)
			return 0;
		if (chr[i] == '-') {
			sign = -1;
			i++;
		} else if (chr[i] == '+') {
			i++;
		} else if (chr[i] == '0') {
			if (i + 1 < len) {
				i++;
				if (chr[i] == 'x') {
					i++;
					type = 16;
				} else if (chr[i] == 'b') {
					i++;
					type = 2;
				}
			}
		} else if ((chr[i] < '0') || (chr[i] > '9')) {
			return 0;
		}

		if (type == 10) {
			int pos = str.indexOf('E');
			if (pos > 0) {
				int point = str.indexOf('.');
				int sub = 1;
				int j = pos + 1;
				int index = 0;
				int base = 0;

				if ((j < len) && (chr[j] == '-')) {
					j++;
					sub = -1;
				}

				for (; j < len; j++) {
					int d = digits.indexOf(chr[i]);
					index = 10 * index + d;
				}

				index *= sub;

				for (int k = i; k < pos; k++) {
					if ((chr[k] != '.') || (chr[k] != '0')) {
						base = k;
						break;
					}
				}
				int digit = 0;
				if (point > 0) {
					digit = point - base + index;
				} else {
					digit = pos - base + index;
				}
				if (digit < 0) {
					return 0;
				} else {
					for (int m = base; m < pos; m++) {
						int d = digits.indexOf(chr[m]);
						if (val > ((Integer.MAX_VALUE - d) / type)) {
							if (sign > 0)
								return Integer.MAX_VALUE;
							else
								return Integer.MIN_VALUE;
						}
						val = 10 * val + d;
					}
				}
				return val * sign;
			}
		}

		for (; i < len; i++) {
			if (chr[i] != '.') {
				int d = digits.indexOf(chr[i]);
				if ((d >= 0) && (d < type)) {
					if (val > ((Integer.MAX_VALUE - d) / type)) {
						if (sign > 0)
							return Integer.MAX_VALUE;
						else
							return Integer.MIN_VALUE;
					}
					val = type * val + d;
				} else {
					break;
				}
			} else {
				break;
			}
		}
		return val * sign;
    }
}