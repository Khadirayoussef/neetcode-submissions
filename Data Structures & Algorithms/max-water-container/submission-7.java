class Solution {
    public int maxArea(int[] heights) {
        int current = 0;

        int i = 0;
        int j = heights.length - 1;
        while (j > i) {
            int maxHeight = Math.min(heights[i], heights[j]);
            int volume = j - i;

            if (current < (maxHeight * volume))
                current = maxHeight * volume;

            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return current;
    }
}
