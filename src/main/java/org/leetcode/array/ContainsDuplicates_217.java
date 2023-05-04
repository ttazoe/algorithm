package org.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates_217 {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> numsSet = new HashSet<>();

    for (int i : nums) {
      if (numsSet.contains(i)) return true;
      numsSet.add(i);
    }

    return false;
  }
}
