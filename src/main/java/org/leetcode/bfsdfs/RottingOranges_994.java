package org.leetcode.bfsdfs;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges_994 {
    public int orangesRotting(int[][] grid) {
        int[][] adjacent = {{-1,0},{1,0},{0,-1},{0,1}};
        int rowLength = grid.length;
        int colLength = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        // BFS approach
        // Initialize queue
        for(int i = 0; i < rowLength; i++) {
            for(int j = 0; j < colLength; j++) {
                if(grid[i][j] == 2) {
                    int[] tmp = {i, j};
                    queue.add(tmp);
                }
            }
        }

        if(queue.size() == 0) {
            // Check initial status
            for(int i = 0; i < rowLength; i++) {
                for(int j = 0; j < colLength; j++) {
                    if(grid[i][j] == 1) {
                        return -1;
                    }
                }
            }
            return 0;
        }


        int ans = 0;

        // BFS
        while(!queue.isEmpty()) {
            ans++;
            int size = queue.size();

            for(int i = 0; i < size; i++) {
                int[] target = queue.poll();
                int row = target[0];
                int col = target[1];

                for(int[] adj : adjacent) {
                    int checkRow = row + adj[0];
                    int checkCol = col + adj[1];
                    if(checkRow >= 0 && checkRow < rowLength && checkCol >= 0 && checkCol < colLength && grid[checkRow][checkCol] == 1) {
                        grid[checkRow][checkCol] = 2;
                        int[] tmp = {checkRow, checkCol};
                        queue.add(tmp);
                    }
                }
            }
        }

        // Check final status
        for(int i = 0; i < rowLength; i++) {
            for(int j = 0; j < colLength; j++) {
                if(grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return ans - 1;
    }
}
