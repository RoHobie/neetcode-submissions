class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, bottom = m - 1;
        int targetRow = -1;
        
        while (top <= bottom) {
            int mid = top + (bottom - top) / 2;
            if (matrix[mid][n - 1] == target) {
                return true;
            } else if (matrix[mid][n - 1] < target) {
                top = mid + 1;
            } else {
                targetRow = mid;
                bottom = mid - 1;
            }
        }
        if (targetRow == -1) {
            return false;
        }
        
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[targetRow][mid] == target) {
                return true;
            } else if (matrix[targetRow][mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false;
    }
}
