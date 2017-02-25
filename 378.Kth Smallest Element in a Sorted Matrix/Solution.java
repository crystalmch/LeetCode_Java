public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int len = matrix.length;
        int[] list = new int[len*len];
        for(int i = 0; i< len; i++){
            for (int j = 0; j < len; j++){
                list[i*len+j] = matrix[i][j];
            }
        }
        Arrays.sort(list);
        return list[k-1];
    }
}