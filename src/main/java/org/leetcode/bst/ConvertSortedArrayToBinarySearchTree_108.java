package org.leetcode.bst;

import java.util.Arrays;

public class ConvertSortedArrayToBinarySearchTree_108 {
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

  // Helper method
  public TreeNode sortedArrayToBST(int[] nums) {
    return createBST(nums, 0, nums.length - 1);
  }

  public TreeNode createBST(int[] nums, int left, int right) {
    if(left > right) return null;

    int mid = (left + right) / 2;
    TreeNode root = new TreeNode(nums[mid]);

    root.left = createBST(nums, left, mid - 1);
    root.right = createBST(nums, mid + 1, right);

    return root;
  }


  // Fast but memory consuming
  public TreeNode sortedArrayToBST(int[] nums) {
    if(nums.length == 0) return null;
    if(nums.length == 1) return new TreeNode(nums[0]);

    int mid = nums.length / 2;

    int[] left = Arrays.copyOfRange(nums, 0, mid); //TODO : Arrays.copyOfRange
    int[] right = Arrays.copyOfRange(nums, mid + 1, nums.length);

    return new TreeNode(nums[mid], sortedArrayToBST(left), sortedArrayToBST(right));
  }
}
