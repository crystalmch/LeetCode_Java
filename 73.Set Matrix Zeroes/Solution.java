public class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] flag = new int[n];
        int i,j;
        Arrays.fill(flag, 0);
        for(i = 0;i < m;i++){
            int index = 0;
            for(j = 0;j < n;j++){
                if(matrix[i][j] == 0){
                    flag[j] = 1;
                    index = 1;
                }
            }
            if(index == 1){
                Arrays.fill(matrix[i], 0);
            }
        }
        for(j=0;j<n;j++){
            if(flag[j] == 1){
                for(i=0;i<m;i++){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}