class Solution {
    public String getHappyString(int n, int k) {
        List<String> list = new ArrayList<>();
        dfs(list, n, new StringBuilder(""));
        // return (list.size() < k ? list.get(k - 1) : "");
        if (list.size() >= k) return list.get(k - 1);
        return "";
    }

    public void dfs(List<String> list, int n, StringBuilder sb) {
        if (sb.length() == n) {
            list.add(sb.toString());
            return;
        }

        if (sb.length() == 0 || sb.charAt(sb.length() - 1) != 'a') {
            sb.append("a");
            dfs(list, n, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (sb.length() == 0 || sb.charAt(sb.length() - 1) != 'b') {
            sb.append("b");
            dfs(list, n, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
         if (sb.length() == 0 || sb.charAt(sb.length() - 1) != 'c') {
            sb.append("c");
            dfs(list, n, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}