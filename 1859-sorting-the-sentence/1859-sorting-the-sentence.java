class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] res = new String[arr.length];
        for (int i = 0; i < res.length; i++) {
            String temp= arr[i];
            int idx = temp.charAt(temp.length() - 1) - '0';
            res[idx - 1] = temp.substring(0, temp.length() - 1);
        }
        StringBuilder sb = new StringBuilder("");
        for (String i: res) {
            sb.append(i + " ");
        }
        return sb.toString().trim();
    }
}