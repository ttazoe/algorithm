package org.leetcode.bfsdfs;

public class NumerOfIslands_200 {
  private int rowLength;
  private int colLength;

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
    if (row < 0 || col < 0 || row >= rowLength || col >= colLength || grid[row][col] == '0') return;
    grid[row][col] = '0';
    dfs(grid, row - 1, col);
    dfs(grid, row + 1, col);
    dfs(grid, row, col - 1);
    dfs(grid, row, col + 1);
  }
}
