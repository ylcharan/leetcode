class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int l = 0, n = s.length();
        String res = "";
        int cnt = 0;
        for (int r = 0; r < n; r++) {
            if (s.charAt(r) == '1') cnt++;

            while (cnt > k) {
                if (s.charAt(l) == '1') cnt--;
                l++;
            }

            while (cnt == k && s.charAt(l) == '0') l++;

            if (cnt == k) {
                String temp = s.substring(l, r + 1);

                if (res.isEmpty() || res.length() > temp.length() || (temp.length() == res.length() && temp.compareTo(res) < 0)) res = temp;
            }
        }
        return res;
    }
}