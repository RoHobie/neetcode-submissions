class Solution {
    public int maxArea(int[] heights) {
        
        int ans = 0;
        int left = 0;
        int right = heights.length - 1;
        
        while(left < right){
            int smaller = Math.min(heights[left], heights[right]);
            int temp = smaller * (right - left);
            ans = Math.max(temp, ans);
            if(smaller == heights[left]) left++;
            else right--;
        }

        return ans;



        // Brute Force
        /*
        int water = 0;
        for(int i = 0; i < heights.length - 1; i++){
            for(int j = i + 1; j < heights.length; j++){
                int temp = Math.min(heights[i],heights[j]) * (j - i);
                water = Math.max(temp, water);
            }
        }
        return water;
        */

    }
}
