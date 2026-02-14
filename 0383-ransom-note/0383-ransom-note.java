class Solution {
    public boolean canConstruct(String r, String m) {
        int[] h1 = new int[26];
        for (char c : m.toCharArray()) {
            h1[c - 'a']++;
        }

        for (char c: r.toCharArray()) {
            h1[c - 'a']--;
            if (h1[c - 'a'] < 0) return false;
        }
        return true;
    }
}