package org.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int n = nums.length;

        for(int i : nums) {
            int count = map.getOrDefault(i,0) + 1;
            if (count > n / 2) ans = i;
            else map.put(i, count);
        }

        return ans;
    }
}
