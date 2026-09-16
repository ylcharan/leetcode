class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        int[] indig = new int[numCourses];

        for (int[] preq : prerequisites) {
            int cr = preq[0];
            int pre = preq[1];
            graph.get(pre).add(cr);
            indig[cr]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indig[i] == 0) queue.offer(i);
        }

        int completed = 0;

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            completed++;
            for (int next: graph.get(cur)) {
                indig[next]--;
                if (indig[next] == 0) {
                    queue.offer(next);
                } 
            }
        }
        return completed == numCourses;
    }
}