class Solution {
    public int minOperations(int n) {
        int ops = 0;
        for (int i = 0; i< n / 2; i++) {
            int temp = (i * 2) + 1; 
            if (n % 2 == 0) ops += temp;
            else ops += temp + 1;
        }
        return ops;
    }
}