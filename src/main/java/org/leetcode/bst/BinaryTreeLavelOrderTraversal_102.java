package org.leetcode.bst;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLavelOrderTraversal_102 {
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> ans = new LinkedList<>();
    Queue<TreeNode> queue = new LinkedList<>();

    if (root == null) {
      return ans;
    }

    queue.add(root);

    while (!queue.isEmpty()) {
      int n = queue.size();
      List<Integer> level = new LinkedList<>();

      for (int i = 0; i < n; i++) {
        TreeNode currentNode = queue.poll();
        level.add(currentNode.val);
        if (currentNode.left != null) {
          queue.add(currentNode.left);
        }
        if (currentNode.right != null) {
          queue.add(currentNode.right);
        }
      }
      ans.add(level);
    }
    return ans;
  }
}
