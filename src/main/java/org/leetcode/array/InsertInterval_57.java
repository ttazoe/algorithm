package org.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval_57 {
  public int[][] insert(int[][] intervals, int[] newInterval) {
    List<int[]> updatedList = new ArrayList<>();
    boolean isInserted = false;

    for (int[] currentInterval : intervals) {
      if (isInserted == true) {
        updatedList.add(currentInterval);
      } else if (!isOverWrapped(currentInterval, newInterval)) {
        if (newInterval[0] < currentInterval[0]) {
          updatedList.add(newInterval);
          isInserted = true;
        }
        updatedList.add(currentInterval);
      } else {
        newInterval = mergeArrays(currentInterval, newInterval);
      }
    }

    if (!isInserted) {
      updatedList.add(newInterval);
    }

    return updatedList.toArray(new int[updatedList.size()][]);
  }

  private boolean isOverWrapped(int[] array1, int[] array2) {

    int array1Start = array1[0];
    int array1End = array1[1];
    int array2Start = array2[0];
    int array2End = array2[1];

    if (array1Start > array2End) return false;
    if (array1End < array2Start) return false;

    return true;
  }

  private int[] mergeArrays(int[] array1, int[] array2) {
    int[] mergedArray = new int[2];
    mergedArray[0] = Math.min(array1[0], array2[0]);
    mergedArray[1] = Math.max(array1[1], array2[1]);
    return mergedArray;
  }
}
