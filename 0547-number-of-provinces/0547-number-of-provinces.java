class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, isConnected, visited);
                ans++;
            }
        }
        return ans;
    }

    public void dfs(int i, int[][] graph, boolean[] visited) {
        visited[i] = true;
        for (int j = 0; j < graph.length; j++) {
            if (graph[i][j] == 1 && !visited[j]) {
                dfs(j, graph, visited);
            }
        }
    }
}