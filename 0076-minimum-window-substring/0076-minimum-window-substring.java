class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        
         int[] arr = new int[128];

         for (int c: t.toCharArray()) {
            arr[c]++;
         }

         int l = 0, r = 0;
         int minLen = Integer.MAX_VALUE;
         String res = "";
         int counter = 0;

         while (r < s.length()) {
            char c = s.charAt(r);
            if (--arr[c] >= 0) {
                counter++;
            }

            while (counter == t.length()) {
                int currWindow = r - l + 1;
                if (currWindow < minLen) {
                    minLen = currWindow;
                    res = s.substring(l, r + 1 );
                }
                if (++arr[s.charAt(l)] > 0) {
                    counter--;
                }
                l++;
            }
            r++;
         } 
         return res;
    }
} 