class Solution {
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;

        for (int i = 0; i < m; i++) {
            if (board[0][i] == 'O') markIslandSave(board, 0, i);
            if (board[n - 1][i] == 'O') markIslandSave(board, n - 1, i);
        }

        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O') markIslandSave(board, i, 0);
            if (board[i][m - 1] == 'O') markIslandSave(board, i, m - 1);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X'; 
                if (board[i][j] == 's') board[i][j] = 'O'; 
            }
        }
    }
    
    public void markIslandSave(char[][] board, int i, int j) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != 'O') return;
        board[i][j] = 's';
        markIslandSave(board, i + 1, j);
        markIslandSave(board, i, j + 1);
        markIslandSave(board, i - 1, j);
        markIslandSave(board, i, j - 1);
    }
}