package org.leetcode.heap;

import java.util.*;

public class FindKPairsWithSmallestSums {
  public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
    // Step 0 : Guard block and initialization
    Queue<int[]> minHeap = new PriorityQueue<>((a,b) -> (a[0] + a[1]) - (b[0] + b[1]));
    List<List<Integer>> ans = new ArrayList<>();

    // Step 1 : Initialize minHeap priority queue with nums1[0]

    for (int i = 0; i < nums1.length && i < k; i++) {
      minHeap.add(new int[]{nums1[i], nums2[0], 0});
    }

    // Step 2 : Update minHeap by increment nums2 index;
    while(k > 0 && !minHeap.isEmpty()) {
      k--;
      int[] curr = minHeap.poll();
      ans.add(List.of(curr[0], curr[1]));

      if (curr[2] + 1 < nums2.length) {
        minHeap.add(new int[]{curr[0], nums2[curr[2] + 1], curr[2] + 1});
      }
    }

    return ans;
  }


  // public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
  // Using Max heap
  // // Step 0 : Guard block and initialization
  // Queue<List<Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.stream().mapToInt(Integer::intValue).sum() - a.stream().mapToInt(Integer::intValue).sum());
  // // Step 1 : Loop fixed nums1 and flexible nums2
  // for (int num1 : nums1) {
  //     for(int num2 : nums2) {
  //         if (maxHeap.size() < k) {
  //             maxHeap.add(new ArrayList<>(Arrays.asList(num1, num2)));
  //         } else {
  //             if (maxHeap.peek().stream().mapToInt(Integer::intValue).sum() < num1 + num2) break;
  //             else {
  //                 maxHeap.poll();
  //                 maxHeap.add(new ArrayList<>(Arrays.asList(num1, num2)));
  //             }
  //         }
  //     }
  // }

  // // Step 2 : Create list for the answer
  // List<List<Integer>> ans = new ArrayList<>(maxHeap);
  // return ans;
  // }
}
