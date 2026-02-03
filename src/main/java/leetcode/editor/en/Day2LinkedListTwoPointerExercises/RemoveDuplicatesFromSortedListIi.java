package leetcode.editor.en.Day2LinkedListTwoPointerExercises;

import leetcode.editor.common.*;

public class RemoveDuplicatesFromSortedListIi {

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode dummy = new ListNode(-1);
            ListNode p = dummy, q = head;

            while (q != null) {
                if (q.next != null && q.val == q.next.val) {
                    while (q.next != null && q.val == q.next.val) {
                        q = q.next;
                    }
                    q = q.next;
                    if (q == null) {
                        p.next = null;
                    }
                } else {
                    p.next = q;
                    p = p.next;
                    q = q.next;
                }
            }
            return dummy.next;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new RemoveDuplicatesFromSortedListIi().new Solution();
        // put your test code here
        
    }
}