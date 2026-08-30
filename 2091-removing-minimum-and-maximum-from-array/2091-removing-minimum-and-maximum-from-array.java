class Solution {
    public int minimumDeletions(int[] nums) {
        int minIdx = 0;
        int maxIdx = 0;
        int n = nums.length;
        if (n == 1) return 1;
        for (int i = 1; i < n; i++) {
            if (nums[minIdx] > nums[i]) minIdx = i;
            if (nums[maxIdx] < nums[i]) maxIdx = i;
        }
        
        int left = Math.min(minIdx, maxIdx);
        int right = Math.max(minIdx, maxIdx);
        
        int fromLeft = right + 1;
        int fromRight = n - left;
        int fromBoth = (left + 1) + (n - right);
        return Math.min(fromLeft, Math.min(fromRight, fromBoth));
}
}