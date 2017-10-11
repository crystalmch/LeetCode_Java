class Solution {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		int len = flowerbed.length;
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (flowerbed[i] == 1)
				continue;
			if (i == 0) {
				if ((i + 1 < len) && (flowerbed[i + 1] == 1)) {
					continue;
				}
			} else if (i == len - 1) {
				if ((i > 0) && (flowerbed[i - 1] == 1)) {
					continue;
				}

			} else {
				if ((flowerbed[i - 1] == 1) || (flowerbed[i + 1] == 1)) {
					continue;
				}
			}
			count++;
			flowerbed[i] = 1;
		}
		return (count >= n);
	}
}