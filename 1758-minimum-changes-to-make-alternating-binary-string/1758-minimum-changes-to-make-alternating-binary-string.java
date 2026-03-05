class Solution {
    public int minOperations(String s) {
        int zyro = 0;
        int one = 0;
        for (int i = 0; i < s.length(); i++) {
            char c1 = (i % 2 == 0) ? '0': '1';
            char c2 = (i % 2 == 0) ? '1': '0';
            if (s.charAt(i) != c1) zyro++;
            if (s.charAt(i) != c2) one++;
        }

        return Math.min(zyro, one);
    }
}