class Solution {
    public int maxDistinct(String s) {
        int total = 0;
        int[] chars = new int[26];
        for (char c: s.toCharArray()) {
            if (chars[c - 'a'] > 0) continue;
            chars[c - 'a']++;
            total++;
        }
        return total;
    }
}