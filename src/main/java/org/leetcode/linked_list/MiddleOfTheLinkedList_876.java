package org.leetcode.linked_list;

import java.util.Objects;

public class MiddleOfTheLinkedList_876 {
    public ListNode middleNode(ListNode head) {
        if (Objects.isNull(head)) return null;
        if (Objects.isNull(head.next)) return head;
        if (Objects.isNull(head.next.next)) return head.next;

        ListNode slow = head.next;
        ListNode fast = head.next.next;

        while (!Objects.isNull(fast)) {
            if (Objects.isNull(fast.next)) return slow;
            if (Objects.isNull(fast.next.next)) return slow.next;

            fast = fast.next.next;
            slow = slow.next;
        }

        return null;
    }
}
