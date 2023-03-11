package org.leetcode.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElements {
  public int[] topKFrequent(int[] nums, int k) {
    // Step 0 : define variables
    int[] ans = new int[k];

    // Step 1 : Count nums
    Map<Integer,Integer> map = new HashMap<>();


    for (int num : nums) {
      map.put(num, map.getOrDefault(num,0) + 1);
    }

    // Step 2 : Create Max heap priority queue (Count)
    Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a)); // 降順

    for (int key : map.keySet()) {
      maxHeap.add(key);
    }

    for (int i = 0; i < k; i++){
      ans[i] = maxHeap.poll().intValue();
    }


    // Step 3 : Poll k times fom priority queue (value)
    return ans;
  }
}
