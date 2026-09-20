class Solution {
    public int reverseDegree(String s) {
        int ttl = 0;
        int idx = 0;
        for (char i : s.toCharArray()) {
            idx++;
            ttl += ((idx) * (26 - (i - 'a')));
        }
        return ttl;
    }
}