package org.leetcode.bst;

public class LowestCommonAncestorOfABinarySearchTree_235 {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    int pVal = p.val;
    int qVal = q.val;

    while(root != null) {
      int rootVal = root.val;

      if (rootVal == pVal || rootVal == qVal) break;
      if (rootVal < pVal && rootVal > qVal) break;
      if (rootVal > pVal && rootVal < qVal) break;

      if (rootVal > pVal && rootVal > qVal) root = root.left;
      if (rootVal < pVal && rootVal < qVal) root = root.right;
    }

    return root;
  }
}
