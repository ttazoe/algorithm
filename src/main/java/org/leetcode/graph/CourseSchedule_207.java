package org.leetcode.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule_207 {
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    int[] indegree = new int[numCourses];
    List<List<Integer>> adj = new ArrayList<>(numCourses);

    for (int i = 0; i < numCourses; i++) {
      adj.add(new ArrayList<>());
    }

    for (int[] prerequisite : prerequisites) {
      adj.get(prerequisite[1]).add(prerequisite[0]);
      indegree[prerequisite[0]]++;
    }

    Queue<Integer> queue = new LinkedList<>();

    for (int i = 0; i < numCourses; i++) {
      if (indegree[i] == 0) {
        queue.offer(i);
      }
    }

    int nodeVisited = 0;

    while (!queue.isEmpty()) {
      int node = queue.poll();
      nodeVisited++;

      for (int neighbor : adj.get(node)) {
        indegree[neighbor]--;
        if (indegree[neighbor] == 0) {
          queue.offer(neighbor);
        }
      }
    }

    return nodeVisited == numCourses;
  }
}
