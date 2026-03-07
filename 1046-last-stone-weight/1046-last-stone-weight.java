class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int stone: stones) {
            pq.offer(-stone);
        }

        while (pq.size() > 1) {
            int prev = pq.poll();
            int cur = pq.poll();
            if (prev != cur) pq.offer(-Math.abs(prev - cur));
        }

        return pq.isEmpty() ? 0 : -pq.poll();
    }
}