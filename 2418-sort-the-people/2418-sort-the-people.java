class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, Integer> idxs = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            idxs.put(heights[i], i);
        }
        Arrays.sort(heights);
        String[] res = new String[names.length];
        for (int i = names.length - 1; i >= 0; i--) {
            int idx = idxs.get(heights[i]);
            res[names.length - i - 1] = names[idx];
        }
        return res;
    }
}