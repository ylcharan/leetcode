class Solution {
    public long countCommas(long n) {
        long ttl = 0;
        for (long x = 1000; x <= n; x *= 1000) {
            ttl += n - x + 1;
        }

        return ttl;
    }
}