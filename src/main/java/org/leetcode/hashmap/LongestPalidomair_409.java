package org.leetcode.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestPalidomair_409 {
  public int longestPalindrome(String s) {
    if (s.length() == 1) return 1;

    Map<Character, Integer> map = new HashMap<>();
    for (char c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    Integer[] charNumArray = map.values().toArray(new Integer[map.size()]);
    Arrays.sort(charNumArray, (a, b) -> b - a);

    int oddCount = 0;
    int max = 0;

    for (int addition : charNumArray) {
      if (addition % 2 == 1) {
        if (oddCount == 0) oddCount = 1;
        else addition--;
      }
      max += addition;
    }

    return max;
  }
}
