package leetcode.editor.en.Day3PrefixSumTricks;

public class RangeSumQuery2dImmutable {

    //leetcode submit region begin(Prohibit modification and deletion)
    class NumMatrix {

        private int[][] preSum;

        public NumMatrix(int[][] matrix) {
            int length = matrix.length;
            int width = matrix[0].length;
            if (length == 0 || width == 0) return;
            preSum = new int[length + 1][width + 1];

            for (int i = 1; i < length + 1; i++) {
                for (int j = 1; j < width + 1; j++) {
                    preSum[i][j] = preSum[i - 1][j] + preSum[i][j - 1] + matrix[i - 1][j - 1] - preSum[i - 1][j - 1];
                }
            }
        }
        
        public int sumRegion(int row1, int col1, int row2, int col2) {
            return preSum[row2 + 1][col2 + 1] - preSum[row1][col2 + 1] - preSum[row2 + 1][col1] + preSum[row1][col1];
        }
    }
    
    /**
     * Your NumMatrix object will be instantiated and called as such:
     * NumMatrix obj = new NumMatrix(matrix);
     * int param_1 = obj.sumRegion(row1,col1,row2,col2);
     */
    //leetcode submit region end(Prohibit modification and deletion)
}