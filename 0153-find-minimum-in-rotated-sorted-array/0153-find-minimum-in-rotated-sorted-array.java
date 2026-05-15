class Solution {
    public int findMin(int[] nums) {
        int i = nums.length - 1;
        while (nums[i] < nums[0]) {
            i--;
        } 
        i = (i + 1) % nums.length;
        return nums[i];
    }
}