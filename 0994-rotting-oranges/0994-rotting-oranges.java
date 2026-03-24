class Solution {
    public int orangesRotting(int[][] grid) {
        Deque<int[]> q = new ArrayDeque<>();
        int time = 0;int fresh = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) fresh++;
                if (grid[i][j] == 2) q.addLast(new int[] {i, j});
            }
        }
        int[][] dirs  = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        while (!q.isEmpty() && fresh > 0) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] pos = q.removeFirst();
                int r = pos[0], c = pos[1];
                for (int[] d: dirs) {
                    int dr = r + d[0];
                    int dc = c + d[1];

                    if (dr < 0 || dr == grid.length || dc < 0 || dc == grid[0].length || grid[dr][dc] != 1) continue;
                    grid[dr][dc] = 2;
                    q.addLast(new int[] {dr, dc});
                    fresh--;
                }
            }
            time++;
        }
        return (fresh == 0) ? time : -1;
    }
}