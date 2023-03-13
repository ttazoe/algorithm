package org.leetcode.bfsdfs;

public class MaxAreaOfIsland_695 {
  private int rowLength;
  private int colLength;

  public int maxAreaOfIsland(int[][] grid) {
    // Step 1 : Guard block
    if(grid.length == 0) return 0;

    rowLength = grid.length;
    colLength = grid[0].length;
    int max = 0;

    // Step 2 : DFS
    for (int row = 0; row < rowLength; row++) {
      for (int col = 0; col < colLength; col++) {
        if (grid[row][col] == 1) {
          max = Math.max(max, dfs(row,col,grid));
        }
      }
    }

    return max;
  }

  private int dfs(int row, int col, int[][] grid) {
    if (row < 0 || col < 0 || row >= rowLength || col >= colLength || grid[row][col] != 1) return 0;
    grid[row][col] = -1;

    int count = 1;
    count += dfs(row - 1, col, grid);
    count += dfs(row + 1, col, grid);
    count += dfs(row, col - 1, grid);
    count += dfs(row, col + 1, grid);

    return count;
  }
}
