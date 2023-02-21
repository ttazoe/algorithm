package org.leetcode.binarysearch;

public class SearchInsertPosition_35 {
  public int searchInsert(int[] nums, int target) {
    int head = 0;
    int tail = nums.length;

    while (head < tail) {
      int mid = (head + tail) / 2;
      if (nums[mid] == target) return mid;
      if (nums[mid] > target) tail = mid;
      if (nums[mid] < target) head = mid + 1;
    }
    return tail;
  }
}
