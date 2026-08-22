class Solution {

    public boolean bs(int[][] matrix, int i, int target) {

        int r = 0;
        int l = matrix[0].length - 1;

        while (r <= l) {

            int mid = r + (l - r) / 2;
            int val = matrix[i][mid];

            if (val < target) {
                r = mid + 1;
            } 
            else if (val > target) {
                l = mid - 1;
            } 
            else {
                return true;
            }
        }

        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        if (target < matrix[0][0]) {
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {

            int val = matrix[i][0];

            if (val == target) {
                return true;
            }

            if (val > target) {
                return bs(matrix, i - 1, target);
            }
        }

        return bs(matrix, matrix.length - 1, target);
    }
}