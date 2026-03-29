class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] map = new int[50 + 1];
        int common = 0;
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            map[A[i]]++;
            if (map[A[i]] == 2) common++;
            map[B[i]]++;
            if (map[B[i]] == 2) common++;
            res[i] = common;
        }
        return res;
    }
}