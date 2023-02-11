package org.leetcode.recursion;

public class Pow_50 {

  public double myPow(double x, int n) {
    if (x == 0) {
      return 0;
    }
    if (x == 1 || n == 0) {
      return 1;
    }
    if (n < 0) {
      n = -n;
      x = 1 / x;
    }

    if (n % 2 == 0) {
      return myPow(x * x, n / 2);
    } else {
      return myPow(x * x, n / 2) * x;
    }
  }

  public double myPow(double x, int n) {
    if (x == 0) {
      return 0;
    }
    if (x == 1) {
      return 1;
    }

    if (n > 0) {
      return myPow(x, n - 1) * x;
    }
    if (n < 0) {
      return myPow(x, n + 1) / x;
    }

    // Condition to complete myPow.(n == 0)
    return 1;
  }
}
