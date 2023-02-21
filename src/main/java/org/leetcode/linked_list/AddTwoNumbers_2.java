package org.leetcode.linked_list;

public class AddTwoNumbers_2 {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode sentinel = new ListNode(0);
    ListNode head = sentinel;
    int carry = 0;

    while (l1 != null || l2 != null) {
      int l1val = 0;
      int l2val = 0;
      int sum = 0;

      if (l1 != null) {
        l1val = l1.val;
        l1 = l1.next;
      }

      if (l2 != null) {
        l2val = l2.val;
        l2 = l2.next;

      }

      sum = l1val + l2val + carry;
      carry = sum / 10;
      head.next = new ListNode(sum % 10);
      head = head.next;
    }

    if (carry == 1) {
      head.next = new ListNode(carry);
    }

    return sentinel.next;
  }
}
