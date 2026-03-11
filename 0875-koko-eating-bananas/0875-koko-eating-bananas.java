class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = Integer.MIN_VALUE;
        for (int i : piles) {
            r = Math.max(i, r);
        }
        int res = r;

        while (l <= r) {
            int k = l + (r - l) / 2;
            long hrs = 0;
            for (int i : piles) {
                hrs += (i + k - 1) / k;
            }

            if (hrs <= h) {
                res = Math.min(res, k);
                r = k - 1;
            } else {
                l = k + 1;
            }
        }

        return res;
    }
}