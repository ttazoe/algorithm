package org.leetcode.bfsdfs;

import java.util.*;

public class FloodFill_733 {
  public int[][] floodFill(int[][] image, int sr, int sc, int color) {

    // Initialization
    int row = image.length;
    int col = image[0].length;
    int[][] searchPatterns = {{-1, 0},{1, 0},{0, -1},{0, 1}};
    boolean[][] seen = new boolean [row][col];
    Queue<List> todo = new LinkedList<>();
    int originalColor = image[sr][sc];

    // BFS
    image[sr][sc] = color;
    seen[sr][sc] = true;
    todo.add(new ArrayList<>(Arrays.asList(sr,sc)));

    while(!todo.isEmpty()) {
      List<Integer> index = todo.poll();
      int indexRow = index.get(0);
      int indexCol = index.get(1);

      for (int[] searchPattern : searchPatterns) {
        int r = searchPattern[0];
        int c = searchPattern[1];
        if (indexRow - r >= 0
            && indexRow - r < row
            && indexCol - c >= 0
            && indexCol - c < col
            && image[indexRow - r][indexCol - c] == originalColor
            && seen[indexRow - r][indexCol - c] == false) {

          image[indexRow - r][indexCol - c] = color;
          seen[indexRow - r][indexCol - c] = true;
          todo.add(new ArrayList<>(Arrays.asList(indexRow -r ,indexCol - c)));
        }
      }
    }

    return image;
  }
}
