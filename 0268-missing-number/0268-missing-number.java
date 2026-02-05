class Solution {
    public int missingNumber(int[] nums) {
        int ans = 0;
        for (int i = 1; i < nums.length + 1; i++) {
            ans ^= i;
            ans ^= nums[i - 1];
        }
        return ans;
    }
}