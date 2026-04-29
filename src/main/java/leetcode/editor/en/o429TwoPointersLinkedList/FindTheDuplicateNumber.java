package leetcode.editor.en.o429TwoPointersLinkedList;

public class FindTheDuplicateNumber {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findDuplicate(int[] nums) {
            // 以下是单链表环检测算法，把数组当作隐式链表
            int fast, slow;
            fast = slow = 0;
            while (true) {
                fast = nums[nums[fast]];
                slow = nums[slow];
                if (fast == slow) break;
            }
            // 重新指向头结点（索引 0）
            slow = 0;
            // 快慢指针同步前进，相交点就是环入口，即重复数字
            while (slow != fast) {
                fast = nums[fast];
                slow = nums[slow];
            }
            return slow;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new FindTheDuplicateNumber().new Solution();
        // put your test code here
        
    }
}