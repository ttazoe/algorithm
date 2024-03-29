package org.leetcode.heap;

import java.util.PriorityQueue;

public class KthClosestPoints_573 {
  public int[][] kClosest(int[][] points, int k) {
//    Arrays.sort(points, (p1, p2) -> p1[0] * p1[0] + p1[1] * p1[1] - p2[0] * p2[0] - p2[1] * p2[1]);
//    return Arrays.copyOfRange(points, 0, K);

    if (points.length <= k) {
      return points;
    }

    PriorityQueue<int[]> pq =
        new PriorityQueue<>(
            (a, b) ->
                (int) (Math.pow(b[0], 2) + Math.pow(b[1], 2))
                    - (int) (Math.pow(a[0], 2) + Math.pow(a[1], 2)));

    for (int[] point : points) {
      pq.add(point);
      if (pq.size() > k) {
        pq.remove();
      }
    }

    int[][] returnPoints = new int[k][2];

    for (int i = 0; i < k; i++) {
      int[] point = pq.poll();
      returnPoints[i] = point;
    }

    return returnPoints;
  }
}
