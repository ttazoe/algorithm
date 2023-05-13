package org.leetcode.bfsdfs;

import java.util.LinkedList;
import java.util.Queue;

public class Matrix_542 {
  public int[][] updateMatrix(int[][] mat) {
    int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    int rowNum = mat.length;
    int colNum = mat[0].length;
    int[][] visited = new int[rowNum][colNum];

    Queue<int[]> queue = new LinkedList<>();

    for (int i = 0; i < rowNum; i++) {
      for (int j = 0; j < colNum; j++) {
        if (mat[i][j] == 0) {
          visited[i][j] = 1;
          queue.add(new int[] {i, j});
        }
      }
    }

    int dest = 1;
    while (!queue.isEmpty()) {
      int queueSize = queue.size();
      for (int k = 0; k < queueSize; k++) {
        int[] temp = queue.poll();

        for (int[] dir : dirs) {
          int row = temp[0] + dir[0];
          int col = temp[1] + dir[1];

          if (row >= 0 && row < rowNum && col >= 0 && col < colNum && visited[row][col] == 0) {
            visited[row][col] = 1;
            mat[row][col] = dest;
            queue.add(new int[] {row, col});
          }
        }
      }
      dest++;
    }

    return mat;
  }
}
