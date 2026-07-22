class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int pile : piles){
            high = Math.max(high, pile);
        }
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;
            long time = 0;
            for(int p : piles) {
                time += (p + mid - 1) / mid;
            }
            if(time <= h) {
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
