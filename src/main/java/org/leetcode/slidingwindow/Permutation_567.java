package org.leetcode.slidingwindow;

import java.util.Arrays;

public class Permutation_567 {
  public boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length()) return false;

    int[] s1map = new int[26];
    int[] s2map = new int[26];

    for (int i = 0; i < s1.length(); i++) {
      s1map[s1.charAt(i) - 'a']++;
      s2map[s2.charAt(i) - 'a']++;
    }

    for (int i = 0; i < s2.length() - s1.length(); i++) {
      if (Arrays.equals(s1map, s2map)) return true;
      s2map[s2.charAt(i + s1.length()) - 'a']++;
      s2map[s2.charAt(i) - 'a']--;
    }

    return Arrays.equals(s1map, s2map);
  }
}
