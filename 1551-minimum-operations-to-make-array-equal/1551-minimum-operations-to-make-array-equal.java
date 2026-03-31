class Solution {
    public int minOperations(int n) {
        int[] arr = new int[n];
        int ops = 0;
        for (int i = 0; i< n / 2; i++) {
            arr[i] = (i * 2) + 1; 
            if (n % 2 == 0) ops += arr[i];
            else ops += arr[i] + 1;
        }
        
        return ops;
    }
}