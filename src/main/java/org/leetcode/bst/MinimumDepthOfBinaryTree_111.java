package org.leetcode.bst;

public class MinimumDepthOfBinaryTree_111 {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }




  // Simple answer
  public int minDepth(TreeNode root) {
    if(root == null) return 0;

    int left = minDepth(root.left);
    int right = minDepth(root.right);

    if(left == 0 || right == 0) {
      return Math.max(left, right) + 1;
    }

    return Math.min(left,right) + 1;
  }

  //Original Answer
  public int minDepth(TreeNode root) {
    if(root == null) return 0;
    if(root.left == null && root.right == null) return 1;

    int left = Integer.MAX_VALUE;
    int right = Integer.MAX_VALUE;

    if(root.left != null) {
      left = minDepth(root.left);
    }
    if(root.right != null) {
      right = minDepth(root.right);
    }

    return Math.min(left,right) + 1;
  }
}
