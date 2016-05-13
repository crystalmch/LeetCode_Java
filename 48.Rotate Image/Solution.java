public class Solution {
	public void rotate(int[][] matrix) {
		int n = matrix.length;
		int[] row = new int[4];
		for (int j = 0; j < n - 1; j++) {
			for (int k = j; j + k < n - 1; k++) {
				row[0] = matrix[j][k];
				row[1] = matrix[k][n - j - 1];
				row[2] = matrix[n - j - 1][n - k - 1];
				row[3] = matrix[n - k - 1][j];

				matrix[k][n - j - 1] = row[0];
				matrix[n - j - 1][n - k - 1] = row[1];
				matrix[n - k - 1][j] = row[2];
				matrix[j][k] = row[3];
			}
		}
	}
}