package org.leetcode.others;

public class MoveZeros_283 {
  public void moveZeroes(int[] nums) {
    int n = nums.length;
    int lastZeroIndex = 0;

    for (int i = 0; i < n; i++) {
      if (nums[i] != 0) {
        nums[lastZeroIndex] = nums[i];
        lastZeroIndex++;
      }
    }

    for (int j = lastZeroIndex; j < n; j++) {
      nums[j] = 0;
    }
  }


    public void moveZeroes(int[] nums) {
    int n = nums.length;

    for (int i = 0; i < n - 1; i ++) {
      if (nums[i] == 0) {
        for (int j = i + 1; j < n; j++) {
          if (nums[j] != 0) {
            int tmp = nums[j];
            nums[j] = nums[i];
            nums[i] = tmp;
            break;
          }
        }
      }
    }
  }
}
