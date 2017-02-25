public class Solution {
    public int countBattleships(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int count = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 'X'){
                    boolean up = (i != 0) && (board[i-1][j] == 'X');
                    boolean left = (j != 0) && (board[i][j-1] == 'X');
                    if(!(up||left)) count++;
                }
            }
        }
        return count;
    }
}