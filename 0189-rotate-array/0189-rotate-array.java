class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] cp = new int[k];
        int idx =0;
        for (int i = nums.length - k; i < nums.length; i++) {
            cp[idx++] = nums[i];
        }

        for (int i = nums.length - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = cp[i];
        }
    }
}