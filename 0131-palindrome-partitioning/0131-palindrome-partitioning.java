class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        dfs(res, 0, new ArrayList<>(), s);
        return res;
    }

    public void dfs(List<List<String>> res, int i, List<String> cur, String s) {
        if (i >= s.length()) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for (int k = i; k < s.length(); k++) {
            if (isPalindrome(s, i, k)) {
                cur.add(s.substring(i, k + 1));
                dfs(res, k + 1, cur, s);
                cur.remove(cur.size() - 1);
            }
        }

    }

    public boolean isPalindrome(String s, int i, int j) {
        if (i == j) return true;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}