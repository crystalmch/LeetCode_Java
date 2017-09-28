public class Solution {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int dim = nums.length * nums[0].length;
		if (dim != r * c)
			return nums;
		int[][] ret = new int[r][c];
		int row = 0, col = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				row = (i * c + j) / nums[0].length;
				col = (i * c + j) % nums[0].length;
				ret[i][j] = nums[row][col];
			}
		}
		return ret;
	}
}