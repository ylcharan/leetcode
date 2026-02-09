class Solution {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder(Integer.toString(Math.abs(x)));
        sb.reverse();

        // if (Integer.parseInt(sb.toString()) > Integer.MAX_VALUE) {
        //     return 0;
        // }
        try {

        if (x > 0) {
            return Integer.parseInt(sb.toString());
        } else {
            return Integer.parseInt(sb.toString()) * -1;
        }
        } catch (Exception e) {
            return 0;
        }

        
    }
}