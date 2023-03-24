package org.leetcode.bst;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree_226 {
  // Recursion
  public TreeNode invertTree(TreeNode root) {
    //Guard block
    if (root == null) return null;
    if (root.left == null && root.right == null) return root;

    TreeNode tmpLeft = root.left;
    root.left = invertTree(root.right);
    root.right = invertTree(tmpLeft);

    return root;
  }

  // BFS
  public TreeNode invertTree(TreeNode root) {
    if (root == null) return null;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      TreeNode currentNode = queue.poll();
      TreeNode tmp = currentNode.left;
      currentNode.left = currentNode.right;
      currentNode.right = tmp;

      if(currentNode.left != null) queue.add(currentNode.left);
      if(currentNode.right != null) queue.add(currentNode.right);
    }

    return root;
  }
}
