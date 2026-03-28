class Solution {
    public List<String> validStrings(int n) {
        List<String> res = new ArrayList<>();
        helper(res,new StringBuilder(""), n, false);
        return res;
    }
    public void helper(List<String> res, StringBuilder sb, int n, boolean hasOne) {
        if (sb.length() == n) {
            res.add(sb.toString());
            return;
        }
        
        sb.append("1");
        helper(res, sb, n, hasOne);
        sb.deleteCharAt(sb.length() - 1);

        if (sb.length() == 0 || sb.charAt(sb.length() - 1) != '0') {
            sb.append("0");
            helper(res, sb, n, true);
            sb.deleteCharAt(sb.length() - 1);
        }

    }
}