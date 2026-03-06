class Solution {
    public boolean checkOnesSegment(String s) {
        int seg = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1' && (i == 0 || s.charAt(i - 1) == '0')) {
                seg++;
                if (seg > 1) return false;
            }
        }
        return true;
    }
}