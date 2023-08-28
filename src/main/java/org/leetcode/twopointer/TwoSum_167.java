package org.leetcode.twopointer;

public class TwoSum_167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int head = 0;
        int tail = numbers.length - 1;

        while(head < tail) {
            int sum = numbers[head] + numbers[tail];
            if (sum == target) {
                ans[0] = head + 1;
                ans[1] = tail + 1;
                return ans;
            } else if (sum > target) {
                tail = tail - 1;
            } else {
                head = head + 1;
            }
        }

        return ans;
    }
}
