package org.leetcode.bst;

public class ValidateBinarySearchTree_98 {
  public boolean isValidBST(TreeNode root, Integer lowerLimit, Integer upperLimit) {
    if (root == null) {
      return true;
    }

    if ((lowerLimit != null && root.val <= lowerLimit) || (upperLimit != null && root.val >= upperLimit)) {
      return false;
    }

    return isValidBST(root.left, lowerLimit, root.val) && isValidBST(root.right, root.val, upperLimit);
  }

  public boolean isValidBST(TreeNode root) {
    return isValidBST(root, null, null);
  }
}
