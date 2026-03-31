class Solution {
    public int minSteps(String s, String t) {
        if (s.length() != t.length()) return -1;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr1[s.charAt(i) - 'a'] += 1;
            arr2[t.charAt(i) - 'a'] += 1;
        }
        int steps = 0;
        for (int i = 0; i < 26; i++) {
            if (arr1[i] > arr2[i]) steps += arr1[i] - arr2[i];
        }
        return steps;
    }
}