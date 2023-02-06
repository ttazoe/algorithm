package org.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

// Problem link : https://leetcode.com/problems/two-sum/
public class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        // This table records diff between target and value as Key and nums index as value.
        Map<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if(hash.containsKey(num)) {
                // diff index + index
                int[] ans = new int[2];
                ans[0] = (int)hash.get(num);
                ans[1] = i;
                return ans;
            } else {
                // save diff as index and value as index.
                hash.put(target - num, i);
            }
        }
        return null;
    }
}
