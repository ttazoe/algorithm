package org.leetcode.array;

public class ProductOfArrayExceptSelf_238 {
  public int[] productExceptSelf(int[] nums) {
    int[] productAscending = new int[nums.length];
    int[] productDescending = new int[nums.length];
    int[] answer = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      if (i == 0) {
        productAscending[i] = nums[i];
      } else {
        productAscending[i] = productAscending[i - 1] * nums[i];
      }
    }

    for (int i = nums.length - 1; i >= 0; i--) {
      if (i == nums.length - 1) productDescending[i] = nums[i];
      else productDescending[i] = productDescending[i + 1] * nums[i];
    }

    for (int i = 0; i < nums.length; i++) {
      if (i == 0) answer[i] = productDescending[i + 1];
      else if (i == nums.length - 1) answer[i] = productAscending[i - 1];
      else answer[i] = productAscending[i - 1] * productDescending[i + 1];
    }

    return answer;
  }
}
