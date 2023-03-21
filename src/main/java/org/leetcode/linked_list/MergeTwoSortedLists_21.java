package org.leetcode.linked_list;

public class MergeTwoSortedLists_21

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode mergedListSentinel = new ListNode(0);
    ListNode header = mergedListSentinel;
    ListNode l1Header = list1;
    ListNode l2Header = list2;

    while (l1Header != null && l2Header != null) {
      if (l1Header.val <= l2Header.val) {
        header.next = l1Header;
        l1Header = l1Header.next;
      } else {
        header.next = l2Header;
        l2Header = l2Header.next;
      }
      header = header.next;
    }

    if (l1Header == null) {
      header.next = l2Header;
    }
    if (l2Header == null) {
      header.next = l1Header;
    }
    return mergedListSentinel.next;

  }
}
