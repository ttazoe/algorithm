package org.leetcode.bst;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal_103 {
  // Queue / Stack の方向は変えないで、LinkedList への登録の順序を変える。こっちのほうが直感的でシンプル。
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    if (root == null)
      return result;

    Queue<TreeNode> nodes = new LinkedList<>();
    nodes.offer(root);

    boolean zigZag = false;

    while (!nodes.isEmpty()) {
      int size = nodes.size();
      LinkedList<Integer> levelValues = new LinkedList<>();
      while(size > 0){
        TreeNode cur = nodes.poll();
        if(!zigZag)
          levelValues.add(cur.val);
        else
          levelValues.addFirst(cur.val);

        if(cur.left != null)
          nodes.offer(cur.left);
        if(cur.right != null)
          nodes.offer(cur.right);

        size--;
      }
      zigZag = !zigZag;
      result.add(levelValues);
    }
    return result;
  }




  // Original
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
