package org.leetcode.stack;

import java.util.Stack;

public class ReverseLinkedList_206 {
  public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  // Two pointer
  public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode prev = null;
    ListNode curr = head;

    while(curr != null) {
      ListNode nextNode = curr.next;
      curr.next = prev;
      prev = curr;
      curr = nextNode;
    }

    return prev;
  }


  // Stack pattern
  public ListNode reverseList(ListNode head) {
    Stack<ListNode> stack = new Stack<>();

    if (head == null || head.next == null) {
      return head;
    }

    ListNode node = head;

    // Create stack
    while (node != null) {
      stack.push(node);
      node = node.next;
    }

    node = stack.pop();
    head = node;
    while (!stack.empty()) {
      node = stack.pop();
      node.next.next = node;
    }
    node.next = null;
    return head;
  }
}
