package org.leetcode.recursion;

public class KthSymbolInGrammer_779 {
  public int kthGrammar(int n, int k) {
    if (n == 1) {
      return 0;
    }
    int parent = kthGrammar(n - 1, (k + 1) / 2);
    //Check if parent is even
    if (parent == 0) {
      //If even return 1
      if (k % 2 == 0) {
        return 1;
      } else {
        return 0;
      }
    }

    //In case parent is odd
    else {
      //If even return 0
      if (k % 2 == 0) {
        return 0;
      } else {
        return 1;
      }
    }
  }
}
