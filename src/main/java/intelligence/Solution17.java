package intelligence;

/**
 * Created by BFD_308 on 2016/9/21.
 */
public class Solution17 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null && list2 != null) return list2;
        if (list2 == null && list1 != null) return list1;
        if (list2 == null && list1 == null) return null;

        ListNode tmpNode = list2;
        while (list1 != null && list2 != null) {
            if (list2.val <= list1.val) {
                tmpNode = list2;
                tmpNode.next = list1.next;
                list1.next = tmpNode;

                list2 = list2.next;
            } else {
                list1 = list1.next;
            }
        }
        return list1;
    }


}
