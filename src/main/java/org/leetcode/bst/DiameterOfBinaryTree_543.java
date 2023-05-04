package org.leetcode.bst;

import java.util.LinkedList;
import java.util.Queue;

public class DiameterOfBinaryTree_543 {
  public int diameterOfBinaryTree(TreeNode root) {
    if (root == null) return 0;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    int max = 0;

    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      max = Math.max(max, calcLongestDiameter(node));
      if (node.left != null) queue.add(node.left);
      if (node.right != null) queue.add(node.right);
    }

    return max;
  }

  private int calcLongestDiameter(TreeNode root) {
    return calcSubTreeHierarchy(root.left) + calcSubTreeHierarchy(root.right);
  }

  private int calcSubTreeHierarchy(TreeNode sub) {
    Queue<TreeNode> queue = new LinkedList<>();
    int hierarchy = 0;

    if (sub != null) queue.add(sub);

    while (!queue.isEmpty()) {
      hierarchy++;
      int qlength = queue.size();
      for (int i = 0; i < qlength; i++) {
        TreeNode node = queue.poll();
        if (node.left != null) queue.add(node.left);
        if (node.right != null) queue.add(node.right);
      }
    }
    return hierarchy;
  }
}
