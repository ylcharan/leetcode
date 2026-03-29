class Solution {
    public int numberOfBeams(String[] bank) {
        int res =0;
        int prevCount = 0;
        for (int i = 0; i < bank.length; i++) {
            int currCount = 0;
            for (int j = 0; j < bank[i].length(); j++) {
                if (bank[i].charAt(j) == '1') currCount++;
            }
            res += currCount * prevCount;
            if (currCount > 0) prevCount = currCount;
        }
        return res;
    }
}