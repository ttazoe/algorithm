package org.leetcode.linked_list;

public class MinStack_155 {
  Node head;

  public MinStack_155() {
    head = null;
  }

  public void push(int val) {
    if (head == null) {
      head = new Node(val, val, null);
    } else {
      head = new Node(val, Math.min(val, head.min), head);
    }
  }

  public void pop() {
    Node tmp = head;
    head = head.next;
    tmp = null;
  }

  public int top() {
    return head.val;
  }

  public int getMin() {
    return head.min;
  }

  private class Node {
    int val;
    int min;
    Node next;

    private Node(int val, int min, Node next) {
      this.val = val;
      this.min = min;
      this.next = next;
    }
  }
}
