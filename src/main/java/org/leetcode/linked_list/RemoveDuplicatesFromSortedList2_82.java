package org.leetcode.linked_list;

public class RemoveDuplicatesFromSortedList2_82 {
  public ListNode deleteDuplicates(ListNode head) {
    if (head == null || head.next == null) return head;

    ListNode sentinel = new ListNode(0, head);
    ListNode pred = sentinel;

    while(head != null) {
      if (head.next != null && head.val == head.next.val) {
        while (head.next != null && head.val == head.next.val) {
          head = head.next;
        }
        pred.next= head.next;
      } else {
        pred = pred.next;
      }
      head = head.next;
    }

    return sentinel.next;
  }


  // ListNode ansHead = null;
  // ListNode ans = null;
  // ListNode runner = head;

  // if (runner.val != runner.next.val) {
  //     ansHead = runner;
  //     ans = ansHead;
  // }
  // while(runner.next.next != null) {
  //     if (runner.val != runner.next.val && runner.next.val != runner.next.next.val) {
  //         if (ansHead == null) {
  //             ansHead = runner.next;
  //             ans = ansHead;
  //         } else {
  //             ans.next = runner.next;
  //             ans = ans.next;
  //         }
  //     }
  //     runner = runner.next;
  // }

  // if (runner.val != runner.next.val) {
  //     if (ansHead == null) {
  //         ansHead = runner.next;
  //         ans = ansHead;
  //     } else {
  //         ans.next = runner.next;
  //         ans = ans.next;
  //     }
  // }

  // if (ans != null) ans.next= null;

  // return ansHead;
}
