package org.leetcode.bst;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal_103 {
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> ans = new LinkedList<>();
    Deque<TreeNode> deque = new LinkedList<>();
    int level = 0;

    if (root == null) return ans;

    deque.addFirst(root);

    while(!deque.isEmpty()) {
      List<Integer> levelValues = new ArrayList<>();
      int dequeSize = deque.size();

      if (level % 2 == 0) {
        for (int i = 0 ; i < dequeSize; i++) {
          TreeNode curr = deque.pollFirst();
          levelValues.add(curr.val);
          if (curr.left  != null) {
            deque.add(curr.left);
          }
          if (curr.right != null) {
            deque.add(curr.right);
          }
        }
      } else {
        for (int i = 0 ; i < dequeSize; i++) {
          TreeNode curr = deque.pollLast();
          levelValues.add(curr.val);
          if (curr.right  != null) {
            deque.addFirst(curr.right);
          }
          if (curr.left != null) {
            deque.addFirst(curr.left);
          }
        }
      }

      ans.add(levelValues);
      level++;

    }
    return ans;
  }
}
