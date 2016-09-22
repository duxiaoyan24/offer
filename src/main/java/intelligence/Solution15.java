package intelligence;

/**
 * Created by BFD_308 on 2016/9/21.
 */

import java.util.Stack;

public class Solution15 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (k <= 0)
            return null;

        Stack<ListNode> stack = new Stack<ListNode>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        for (int i = 1; i < k; i++) {
            if (!stack.empty())
                stack.pop();
            else
                return null;
        }
        if (!stack.empty())
            return stack.pop();
        else
            return null;
    }
}
