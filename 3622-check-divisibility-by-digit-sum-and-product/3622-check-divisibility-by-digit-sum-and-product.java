class Solution {
    public boolean checkDivisibility(int n) {
        int n1 = n;
        int sum = 0;
        int prod = 1;
        while (n > 0) {
            int temp = n % 10;
            sum += temp;
            prod *= temp;
            n /= 10;
        }
        return (n1 % (sum + prod)) == 0;
    }
}