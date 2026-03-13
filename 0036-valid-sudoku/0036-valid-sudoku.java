class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, HashSet<Character>> rows = new HashMap<>();
        Map<Integer, HashSet<Character>> cols = new HashMap<>();
        Map<Integer, HashSet<Character>> sqrs = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            rows.put(i, new HashSet<>());
            cols.put(i, new HashSet<>());
            sqrs.put(i, new HashSet<>());
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                int b = (i / 3) * 3 + (j / 3);
                if (rows.get(i).contains(board[i][j]) 
                || cols.get(j).contains(board[i][j]) 
                || sqrs.get(b).contains(board[i][j])) return false;
                rows.get(i).add(board[i][j]);
                cols.get(j).add(board[i][j]);
                sqrs.get(b).add(board[i][j]);
            }
        }
        return true;
    }
}