package org.leetcode.linked_list;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle_142 {

  // Fast Slow
  public ListNode detectCycle(ListNode head) {
    if(head == null || head.next == null) return null;

    ListNode slow = head;
    ListNode fast = head;

    while(fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) break;
    }

    if(fast == null || fast.next == null) return null;

    ListNode chase = head;

    while(chase != slow) {
      chase = chase.next;
      slow = slow.next;
    }

    return slow;
  }


  // HashSet approach
  public ListNode detectCycle(ListNode head) {
    if (head == null) return null;

    ListNode search = head;
    Set<ListNode> nodes = new HashSet<>();

    while (search != null) {
      if (nodes.contains(search)) return search;
      nodes.add(search);
      search = search.next;
    }
    return null;
  }
}
