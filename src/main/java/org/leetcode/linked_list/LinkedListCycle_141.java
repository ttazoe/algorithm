package org.leetcode.linked_list;

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
