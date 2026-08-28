class Solution {
    public String makeSmallestPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                sb.append(s.charAt(l));
                r--; l++;
                continue;
            }

            if (s.charAt(l) - s.charAt(r) > 0) sb.append(s.charAt(r));
            else sb.append(s.charAt(l));

            r--;
            l++;
        }

        return sb.toString() + (s.length() % 2 == 1 ? s.charAt(l) : "") + sb.reverse().toString();
    }
}