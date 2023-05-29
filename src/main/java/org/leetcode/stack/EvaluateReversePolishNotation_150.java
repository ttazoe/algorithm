package org.leetcode.stack;

import java.util.Stack;

public class EvaluateReversePolishNotation_150 {
  public int evalRPN(String[] tokens) {
    if (tokens.length == 1) return Integer.valueOf(tokens[0]);

    Stack<Integer> stack = new Stack<>();

    for (String c : tokens) {
      if (c.equals("+") || c.equals("-") || c.equals("/") || c.equals("*")) {
        int val1 = stack.pop();
        int val2 = stack.pop();
        int ans = 0;
        if (c.equals("+")) ans = val2 + val1;
        if (c.equals("-")) ans = val2 - val1;
        if (c.equals("*")) ans = val2 * val1;
        if (c.equals("/")) ans = val2 / val1;

        stack.push(ans);
      } else {
        stack.push(Integer.valueOf(c));
      }
    }

    return stack.pop();
  }
}
