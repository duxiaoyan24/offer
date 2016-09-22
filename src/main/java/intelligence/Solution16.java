package intelligence;

/**
 * Created by BFD_308 on 2016/9/21.
 */
public class Solution16 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {
        if (head == null) return null;

        ListNode p1 = null;
        ListNode p2 = null;
        ListNode pre = null;
        while (p2 != null) {
            pre = p1;
            p1 = p2;
            p2 = p2.next;
            p1.next = pre;
        }
        ListNode newHead = p1;
        while (p1 != null) {
            System.out.println(p1.val);
            p1 = p1.next;
        }
        return newHead;
    }
}
