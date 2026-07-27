class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> ls = new Stack<>();
        Stack<Integer> rs = new Stack<>();
        int[] lsi = new int[heights.length];
        int[] rsi = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            while (!ls.isEmpty() && heights[ls.peek()] >= heights[i]) {
                ls.pop();
            }

            lsi[i] = ls.isEmpty() ? -1: ls.peek();
            ls.push(i);
            while (!rs.isEmpty() && heights[rs.peek()] >= heights[heights.length - i- 1]) {
                rs.pop();
            }

            rsi[heights.length - i - 1] = rs.isEmpty() ? heights.length  : rs.peek();
            rs.push(heights.length - i - 1);
        }

        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int currArea = heights[i] * Math.max(rsi[i] - lsi[i] - 1, 1);
            maxArea = Math.max(currArea, maxArea);
        }
        return maxArea;
    }
}