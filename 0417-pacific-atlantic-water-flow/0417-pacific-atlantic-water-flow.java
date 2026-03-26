class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;

        boolean[][] pas = new boolean[m][n];
        boolean[][] atl = new boolean[m][n];


        for (int i = 0; i < n; i++) {
            dfs(0, i, pas, heights[0][i], heights);
            dfs(m - 1, i, atl, heights[m - 1][i],heights);
        }

        for (int i = 0; i < m; i++) {
            dfs(i, 0, pas, heights[i][0], heights);
            dfs(i, n - 1, atl, heights[i][n - 1], heights);
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int[] co = {i, j};
                if (pas[i][j] && atl[i][j]) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    res.add(temp);
                }
            }
        }
        return res;
    }

    public void dfs(int r, int c, boolean[][] visit, int prev, int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        if ( r < 0 || c < 0 || r == m || c == n || visit[r][c] || prev > heights[r][c]) return;
        visit[r][c] = true;
        dfs(r + 1, c, visit, heights[r][c], heights);
        dfs(r - 1, c, visit, heights[r][c], heights);
        dfs(r , c + 1, visit, heights[r][c], heights);
        dfs(r, c - 1, visit, heights[r][c], heights);
    }
}