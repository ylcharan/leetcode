class Solution {
    public int largestIsland(int[][] grid) {
        Map<Integer, Integer> size = new HashMap<>();
        int label = 2;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1){
                    size.put(label, dfs(grid, i, j, label));
                    label++;
                }
            }
        }
        int maxSize = 0;
        for (int i : size.values()) {
            maxSize = Math.max(maxSize, i);
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    maxSize = Math.max(maxSize, connect(grid, i, j, size));
                }
            }
        }

        return maxSize;
    }

    public int connect(int[][] grid, int i, int j, Map<Integer, Integer> map) {
        Set<Integer> visited = new HashSet<>();

        int size = 1;
        int[][] nei = {{i - 1, j}, {i + 1, j}, {i, j - 1}, {i, j + 1}};
        for (int[] n : nei) {
            int r = n[0];
            int c = n[1];
            if (!(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0 || visited.contains(grid[r][c]) || !map.containsKey(grid[r][c]))) {
                size += map.get(grid[r][c]);
                visited.add(grid[r][c]);
            }
        }
        return size;
    }

    public int dfs(int[][] grid, int i, int j, int label) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid.length || grid[i][j] != 1) return 0;

        grid[i][j] = label;
        int[][] nei = { {i - 1, j}, {i + 1, j}, {i, j - 1}, {i, j + 1} };
        int size = 1;
        for (int[] n : nei) {
            size += dfs(grid, n[0], n[1], label);
        }
        return size;
    }
}