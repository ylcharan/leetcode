class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < arr.length; i++) {
            sb.append(rev(arr[i])).append(" ");
        }
        return sb.toString().trim();
    }
    public String rev(String s) {
        StringBuilder sb = new StringBuilder("");
        for (int i = s.length() -1; i > -1; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}