package org.leetcode.linked_list;

import org.leetcode.linked_list.LinkedListCycle_141.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle_141 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    //Two pointer
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> checkedNodeList = new HashSet<>();

        while(head != null ){
            if(checkedNodeList.contains(head)) {
                return true;
            }
            checkedNodeList.add(head);
            head = head.next;
        }
        return false;
    }
}
