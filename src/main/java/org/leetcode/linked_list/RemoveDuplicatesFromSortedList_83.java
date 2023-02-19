package org.leetcode.linked_list;

public class RemoveDuplicatesFromSortedList_83 {
  public ListNode deleteDuplicates(ListNode head) {
    if (head == null || head.next == null) return head;

    ListNode curr = head;
    ListNode next = curr.next;

    while(next != null) {
      if (curr.val == next.val) {
        next = next.next;
      } else {
        curr.next = next;
        curr = next;
      }
    }
    curr.next = null;

    return head;
  }
}
