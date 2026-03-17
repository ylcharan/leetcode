class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> arr = new ArrayList<>();
        arr.add(intervals[0]);
        for (int[] i : intervals) {
            int last = arr.get(arr.size() - 1)[1];
            if (i[0] <= last) {
                arr.get(arr.size() - 1)[1] = Math.max(last, i[1]);
            } else {
                arr.add(new int[] {i[0], i[1]});
            }
        }
        int[][] res = new int[arr.size()][2];
        for (int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        }
        return res;
    }
}