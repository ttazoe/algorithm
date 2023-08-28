package org.leetcode.twopointer;

public class ContainerWithMostWarter_11 {
    public int maxArea(int[] height) {
        int max = 0;
        int head = 0;
        int tail = height.length - 1;

        while(head < tail) {
            int x = tail - head;
            int y = Math.min(height[head], height[tail]);
            max = Math.max(max, x * y);

            if (height[head] < height[tail]) head++;
            else tail--;
        }

        return max;
    }
}
