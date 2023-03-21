package org.leetcode.array;

public class BestTimeToBuyAndSellStock_121 {
  public int maxProfit(int[] prices) {
    int diff = 0 ;
    int min = prices[0];
    int max = 0;

    for (int i = 1; i < prices.length ; i ++)  {
      int price = prices[i];
      if (price < min) {
        min = price;
      } else if (price - min > diff) {
        diff = price - min;
      }
    }

    return diff;
  }
}
