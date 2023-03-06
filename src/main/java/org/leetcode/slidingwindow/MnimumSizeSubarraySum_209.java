package org.leetcode.slidingwindow;

public class MnimumSizeSubarraySum_209 {
  public int minSubArrayLen(int target, int[] nums) {
    int left = 0;
    int right = 0;
    int minLength = Integer.MAX_VALUE;
    int sum = 0;

    while (left < nums.length && right < nums.length) {
      sum += nums[right];
      while (sum >= target) {
        minLength = Math.min(minLength, right - left + 1);
        sum = sum - nums[left];
        left++;
      }
      right++;
    }

    if (minLength == Integer.MAX_VALUE) {
      minLength = 0;
    }

    return minLength;
  }
}
