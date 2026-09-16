class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        int[] indig = new int[numCourses];
        for (int[] preq: prerequisites) {
            int cr = preq[0];
            int pre = preq[1];

            graph.get(pre).add(cr);
            indig[cr]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indig[i] == 0) queue.offer(i);
        }

        int[] res = new int[numCourses];
        int idx = 0;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            res[idx++] = cur;
            for (int next: graph.get(cur)) {
                indig[next]--;

                if (indig[next] == 0) {
                    queue.offer(next);
                }
             }
        }
        if (idx != numCourses) return new int[0];
        return res;
    }
}