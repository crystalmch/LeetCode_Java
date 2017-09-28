import java.util.Arrays;

public class Solution {
	public int distributeCandies(int[] candies) {
		int len = candies.length;
		int count = 1;
		Arrays.sort(candies);
		for (int i = 1; i < len; i++) {
			if (candies[i] != candies[i - 1]) {
				count++;
				if (count >= len / 2)
					return len / 2;
			}
		}
		return count;
	}
}
