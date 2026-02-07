class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;

        for (int i : nums) {
            if (i != 0) nums[k++] = i;
        }

        for (int i = k; i < nums.length; i++) {
            nums[k++] = 0;
        }
    }
}