import java.util.Arrays;

public class Solution {
	public int[] nextGreaterElement(int[] findNums, int[] nums) {
		int len = findNums.length;
		int slen = nums.length;
		if (slen < 1)
			return findNums;
		String[] temp = Arrays.toString(nums).split("[\\[\\]]")[1].split(", ");
		String s;
		int flag;
		for (int i = 0, j = 0; i < len; i++) {
			flag = -1;
			s = Integer.toString(findNums[i]);
			for (j = Arrays.asList(temp).indexOf(s); j < slen; j++) {
				if (nums[j] > findNums[i]) {
					flag = nums[j];
					break;
				}
			}
			findNums[i] = flag;
		}
		return findNums;
	}
}
