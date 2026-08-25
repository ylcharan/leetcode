class Solution {
    public int missingMultiple(int[] nums, int k) {
        int[] hash = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % k != 0) continue;
            int index = nums[i] / k;

            if (index <= nums.length) {
                hash[index] = 1;
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            // System.out.println(hash[i]);
            if (hash[i] == 0) {
                return i * k;
            }
        }
        return (nums.length + 1) * k;
    }
}