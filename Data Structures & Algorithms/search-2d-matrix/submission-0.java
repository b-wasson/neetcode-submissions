class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] <= target && target <= matrix[i][cols - 1]) {
                return bSearch(matrix[i], target, 0, cols - 1) != -1;
            }
        }

        return false;
    }

    public int bSearch(int[] row, int target, int l, int r) {
        while (l <= r) {
            int mid = (l + r) / 2;
            if (row[mid] == target) {
                return mid;
            } else if (row[mid] > target) {
                r = mid - 1; 
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}