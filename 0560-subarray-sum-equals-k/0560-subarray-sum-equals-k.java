class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> set = new HashMap<>();
        int pref = 0;
        for (int i = 0; i < nums.length; i++) {
            pref += nums[i];
            if (set.containsKey(pref - k)) {
                count += set.get(pref - k);
            }
            set.put(pref, set.getOrDefault(pref, 0) + 1);
            if (pref == k) count++;
        }
        return count;
    }
}