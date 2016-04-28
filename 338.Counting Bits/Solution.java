public class Solution {
    public int[] countBits(int num) {
		int[] result = new int[num + 1];
		if (num == 0) {
			result[0] = 0;
			return result;
		}
		result[1] = 1;
		result[0] = 0;
		
		if (num > 1) {
			int i = (int) (Math.log(num) / Math.log(2.0d));
			int begin = (int) Math.pow(2, i);
			int end = (int) Math.pow(2, i + 1) - 1;
			int min = num;
			if ((num <= end) && (begin <= num)) {
				int[] sub = countBits(end - begin);
				for (int j = begin; j <= min; j++) {
					result[j] = sub[j - begin] + 1;
				}
				int sub_len = sub.length;
				System.arraycopy(sub, 0, result, 0, sub_len);
			}
		}
		return result;
    }
}