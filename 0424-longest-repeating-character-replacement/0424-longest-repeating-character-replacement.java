class Solution {
    public int characterReplacement(String s, int k) {
        int[] chars = new int[26];
        int start = 0, maxFreq = 0, maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'A']++;
            maxFreq = Math.max(maxFreq, chars[s.charAt(i) - 'A']);

            while ((i - start + 1) - maxFreq > k) {
                chars[s.charAt(start) - 'A']--;
                start++;
            }

            maxLen = Math.max(maxLen, i - start + 1);
        } 
        return maxLen;
    }
}