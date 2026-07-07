class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length - 1; i++){
            int num = target - numbers[i];
            int low = i + 1;
            int high = numbers.length - 1;
            while(low <= high){
                int mid = low + (high - low) / 2;
                if(numbers[mid] == num){
                    return new int[]{i + 1, mid + 1};
                }else if(numbers[mid] < num){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return new int[]{};
    }
}
