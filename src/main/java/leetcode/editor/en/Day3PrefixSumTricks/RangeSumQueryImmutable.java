package leetcode.editor.en.Day3PrefixSumTricks;

public class RangeSumQueryImmutable {

    //leetcode submit region begin(Prohibit modification and deletion)
    class NumArray {

        private int[] preSum;

        public NumArray(int[] nums) {
            preSum = new int[nums.length + 1];
            for (int i = 1; i < nums.length + 1; i++) {
                preSum[i] = preSum[i - 1] + nums[i - 1];
            }
        }
        
        public int sumRange(int left, int right) {
            return preSum[right + 1] - preSum[left];
        }
    }
    
    /**
     * Your NumArray object will be instantiated and called as such:
     * NumArray obj = new NumArray(nums);
     * int param_1 = obj.sumRange(left,right);
     */
    //leetcode submit region end(Prohibit modification and deletion)

}