package org.leetcode.bfsdfs;

import java.util.*;

public class NumerOfIslands_200 {
  private int rowLength;
  private int colLength;

  // DFS
  public int numIslands(char[][] grid) {
    // Step 1 : Guard block
    rowLength = grid.length;
    if (rowLength == 0) return 0 ;
    colLength = grid[0].length;
    int count = 0;

    // Step 2 : DFS
    for (int row = 0; row < rowLength; row++) {
      for (int col = 0; col < colLength; col++) {
        if (grid [row][col] == '1') {
          dfs(grid, row, col);
          count++;
        }
      }
    }
    return count;
  }

  private void dfs(char[][] grid, int row, int col) {
    if (row < 0 || col < 0 || row >= rowLength || col >= colLength || grid[row][col] != '1') return;
    grid[row][col] = '0';
    dfs(grid, row - 1, col);
    dfs(grid, row + 1, col);
    dfs(grid, row, col - 1);
    dfs(grid, row, col + 1);
  }

  //BFS
  public int numIslandsBfs(char[][] grid) {
    // Step 1 : Guard block and initialization
    rowLength = grid.length;
    if(rowLength == 0) return 0;
    colLength = grid[0].length;
    int count = 0;

    // Step 2 : BFS
    Queue<List<Integer>> q = new LinkedList<>();

    for(int row = 0; row < rowLength; row++){
      for(int col = 0; col < colLength; col++) {
        if (grid[row][col] == '1') {
          q.add(Arrays.asList(row, col));
          grid[row][col] = '0';
          count++;
        }

        while(! q.isEmpty()) {
          List<Integer> indexes = q.poll();
          int tmpRow = indexes.get(0).intValue();
          int tmpCol = indexes.get(1).intValue();

          if(tmpRow - 1 >= 0) {
            if (grid[tmpRow - 1][tmpCol] == '1') {
              q.add(Arrays.asList(tmpRow - 1, tmpCol));
              grid[tmpRow -1][tmpCol] = '0';
            }
          }
          if(tmpRow + 1 < rowLength) {
            if (grid[tmpRow + 1][tmpCol] == '1') {
              q.add(Arrays.asList(tmpRow + 1, tmpCol));
              grid[tmpRow + 1][tmpCol] = '0';
            }
          }
          if(tmpCol - 1 >= 0) {
            if (grid[tmpRow][tmpCol - 1] == '1') {
              q.add(Arrays.asList(tmpRow, tmpCol - 1));
              grid[tmpRow][tmpCol - 1] = '0';
            }
          }
          if(tmpCol + 1 < colLength) {
            if (grid[tmpRow][tmpCol + 1] == '1') {
              q.add(Arrays.asList(tmpRow, tmpCol + 1));
              grid[tmpRow][tmpCol + 1] = '0';
            }
          }
        }
      }
    }

    return count;
  }
}
