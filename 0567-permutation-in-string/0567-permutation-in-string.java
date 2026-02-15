class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr = new int[26];
        for (char c: s1.toCharArray()) {
            arr[c - 'a']++;
        }

        int l = 0, r = 0;
        int counter = 0;

        while (r < s2.length()) {
            char c = s2.charAt(r);
            if (--arr[c - 'a'] >= 0) {
                counter++;
            }

            if (r - l + 1 > s1.length()) {
                char lc = s2.charAt(l);
                if (++arr[lc - 'a'] > 0) {
                    counter--;
                }
                l++;
            }

            if (counter == s1.length()) return true;
            r++;
        }
        return false;
    }
}