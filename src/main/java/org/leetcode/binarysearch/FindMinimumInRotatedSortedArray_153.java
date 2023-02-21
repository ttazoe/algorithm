package org.leetcode.binarysearch;

public class FindMinimumInRotatedSortedArray_153 {
  public int findMin(int[] nums) {
    int head = 0;
    int tail = nums.length;

    if (nums.length == 1) return nums[0];
    if (nums[0] < nums[nums.length - 1]) return nums[0];

    while(head < tail) {
      int mid = (head + tail) / 2;

      if (mid > 0) {
        if (nums[mid] < nums[mid - 1]) return nums[mid];
      }
      if (mid < nums.length - 1) {
        if (nums[mid] > nums[mid + 1]) return nums[mid + 1];
      }

      if (nums[0] < nums[mid]) {
        head = mid + 1;
      } else {
        tail = mid - 1;
      }
    }
    return 0;
  }
}
