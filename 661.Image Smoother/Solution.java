class Solution {
	public int[][] imageSmoother(int[][] M) {
		int row = M.length;
		int col = M[0].length;
		int[][] res = new int[row][col];
		int count = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				count = 0;
				for (int x = Math.max(i - 1, 0); x <= Math.min(i + 1, row - 1); x++) {
					for (int y = Math.max(j - 1, 0); y <= Math.min(j + 1,
							col - 1); y++) {
						count++;
						res[i][j] = res[i][j] + M[x][y];
					}
				}
				res[i][j] = res[i][j] / count;
			}
		}
		return res;
	}
}