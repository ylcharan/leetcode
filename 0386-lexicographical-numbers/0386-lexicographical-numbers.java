class Solution {
    public List<Integer> lexicalOrder(int n) {
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = i + 1 + "";
        }
        Arrays.sort(s);
        List<Integer> res = new ArrayList<>();
        for (String i: s) {
            res.add(Integer.parseInt(i));
        }
        return res;
    }
}