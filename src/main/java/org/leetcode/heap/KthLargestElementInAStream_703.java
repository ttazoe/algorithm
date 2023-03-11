package org.leetcode.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElementInAStream_703 {
  private PriorityQueue<Integer> pq;
  private int k;
  public KthLargestElementInAStream_703(int k, int[] nums) {
    this.k = k;
    pq = new PriorityQueue<>();

    for(int i = 0; i < Math.min(k, nums.length); i++) {
      pq.add(nums[i]);
    }

    for(int i = k; i < nums.length; i++) {
      pq.add(nums[i]);
      pq.poll();
    }
  }

  public int add(int val) {
    pq.add(val);
    if(pq.size() > k) {
      pq.poll();

    }
    return pq.peek();
  }


  // Sort pattern, Sorting is too much to get the kth largest value.
  //  int k;
//  int[] nums;
//
//  public KthLargestElementInAStream_703(int k, int[] nums) {
//    this.k = k;
//    this.nums = nums;
//  }
//
//  public int add(int val) {
//    int[] temp_nums = new int[nums.length + 1];
//    System.arraycopy(nums,0,temp_nums,0,nums.length);
//    temp_nums[nums.length] = val;
//    nums = temp_nums;
//    Arrays.sort(nums);
//    return nums[nums.length - k];
//  }
}
