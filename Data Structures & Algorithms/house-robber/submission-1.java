class Solution {
    public int rob(int[] nums) {
        int index = 0;
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return recursive(nums, index, memo);
    }

    int recursive(int[] nums, int index, int[] memo){
        if(index >= nums.length){
            return 0;
        }

        if(memo[index] != -1){
            return memo[index];
        }

        int keep = nums[index] + recursive(nums, index + 2, memo);
        int skip = recursive(nums, index + 1, memo);

        memo[index] = Math.max(keep, skip);
        
        return memo[index];
    }
}
