package org.leetcode.stack;

import java.util.Stack;

public class ValidParentheses_20 {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0 ; i < s.length(); i++) {
      char c = s.charAt(i);
      if(c == '{' || c == '(' || c == '[') {
        stack.push(c);
      } else {
        if (stack.empty()) {
          return false;
        }

        Character pop = stack.pop();

        if (c == ']' && pop != '[') {
          return false;
        }
        if (c == ')' && pop != '(') {
          return false;
        }
        if (c == '}' && pop != '{') {
          return false;
        }
      }
    }

    if(stack.empty()) {
      return true;
    }

    return false;
  }
}
