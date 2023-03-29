package org.leetcode.stack;

import java.util.Stack;

public class MyQueue_232 {
  private Stack<Integer> input = new Stack();
  private Stack<Integer> output = new Stack();

  public MyQueue_232() {

  }

  public void push(int x) {
    input.push(x);
  }

  public int pop() {
    peek();
    return output.pop();
  }

  public int peek() {
    if (output.isEmpty()){
      while(!input.isEmpty()) {
        output.push(input.pop());
      }
    }
    return output.peek();
  }

  public boolean empty() {
    if (input.isEmpty() && output.isEmpty()) return true;
    return false;
  }
}
