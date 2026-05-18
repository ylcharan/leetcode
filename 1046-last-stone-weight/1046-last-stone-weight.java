class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i : stones) {
            pq.offer(i);
        }
        while (pq.size() > 1) {
            int s1 = pq.poll();
            int s2 = pq.poll();
            if (Math.abs(s1 - s2) > 0) pq.offer(Math.abs(s1 - s2));
        }
        if (pq.size() == 1) return pq.peek();
        return 0;
    }
}