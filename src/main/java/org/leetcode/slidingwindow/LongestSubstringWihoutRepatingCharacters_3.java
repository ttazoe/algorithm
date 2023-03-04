package org.leetcode.slidingwindow;

public class LongestSubstringWihoutRepatingCharacters_3 {
  public int lengthOfLongestSubstring(String s) {
    if (s == null) return 0;
    Map<Character, Integer> map = new HashMap<>();

    int left = 0;
    int right = 0;
    int maxLength = 0;

    while (left < s.length() && right < s.length()) {
      char c = s.charAt(right);
      if (map.containsKey(c)) {
        left = Math.max(left, map.get(c) + 1);
      }
      maxLength = Math.max(maxLength, right - left + 1);
      map.put(c,right);
      right++;
    }
    return maxLength;
  }

}
