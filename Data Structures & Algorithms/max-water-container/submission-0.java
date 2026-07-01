class Solution {
    public int maxArea(int[] heights) {
        int water = 0;
        for(int i = 0; i < heights.length - 1; i++){
            for(int j = i + 1; j < heights.length; j++){
                int temp = Math.min(heights[i],heights[j]) * (j - i);
                water = Math.max(temp, water);
            }
        }
        return water;
    }
}
