package org.leetcode.binarysearch;

public class CapacityToShipPackagesWithinDDays_1011 {
  public int shipWithinDays(int[] weights, int days) {
    // Step 1 : Calculate initial max = ""weights sum"" and min = "biggest single weight".

    int max = 0;
    int min = 0;

    for (int i = 0; i < weights.length; i++) {
      max += weights[i];
      if (min < weights[i]) {
        min = weights[i];
      }
    }

    // Step 2 : binary search
    int weightLimit = max;

    while (min < max) {
      int mid = (max + min) / 2;
      int day = 1;
      int weightSum = 0;

      for(int i = 0; i < weights.length; i++) {
        if (weightSum + weights[i] <= mid) {
          weightSum += weights[i];
        } else {
          day++;
          weightSum = weights[i];
        }
      }

      if (day > days) {
        min = mid + 1;
      } else {
        weightLimit = mid;
        max = mid;
      }
    }

    return weightLimit;
  }

}
