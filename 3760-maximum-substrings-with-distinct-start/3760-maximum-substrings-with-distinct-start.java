class Solution {
    public int maxDistinct(String s) {
        int ttl = 0;
        int[] hash = new int[26];
        for (char c: s.toCharArray()) {
            if (hash[c - 'a'] > 0) continue;
            hash[c - 'a']++;
            ttl++;
        }
        return ttl;
    }
}