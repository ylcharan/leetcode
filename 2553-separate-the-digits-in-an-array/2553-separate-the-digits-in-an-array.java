class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for (int i: nums) {
            List<Integer> tempArr = new ArrayList<>();
            while (i != 0) {
                int temp = i % 10;
                i /= 10;
                tempArr.add(temp);
            }
            for (int j = tempArr.size() - 1; j >= 0; j--) {
                arr.add(tempArr.get(j));
            }
        }
        int[] res = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        } 
        return res;
    }
}