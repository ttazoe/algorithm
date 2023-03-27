package org.leetcode.bst;

public class BalancedBinaryTree_110 {
  boolean result = true;

  public boolean isBalanced(TreeNode root) {
    maxHeight(root);
    return result;
  }

  public int maxHeight(TreeNode root) {
    if(root == null) return 0;

    int l = maxHeight(root.left);
    int r = maxHeight(root.right);

    if (Math.abs(l - r) > 1) result = false;

    return 1 + Math.max(l, r);
  }
}
