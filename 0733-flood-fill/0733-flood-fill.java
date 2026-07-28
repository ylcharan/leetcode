class Solution {
    public void colorThePaint(int[][] image, int r, int c, int tc, int color) {
        if (r < 0 || c < 0 || r > image.length - 1 || c > image[0].length - 1 || image[r][c] != tc) return;
        image[r][c] = color;
        colorThePaint(image, r + 1, c, tc, color);
        colorThePaint(image, r, c + 1, tc, color);
        colorThePaint(image, r - 1, c, tc, color);
        colorThePaint(image, r, c - 1, tc, color);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color)
            return image;
        colorThePaint(image, sr, sc, image[sr][sc], color);
        return image;
    }
}