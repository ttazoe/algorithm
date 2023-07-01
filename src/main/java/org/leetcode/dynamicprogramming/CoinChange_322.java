package org.leetcode.dynamicprogramming;

public class CoinChange_322 {

  public int coinChange(int[] coins, int amount) {
    if (amount == 0) return 0;

    int[] dp = new int[amount + 1];

    for (int i = 1; i < amount + 1; i++) {
      for (int coin : coins) {
        if (coin == i) {
          dp[i] = 1;
          break;
        }

        if (i - coin < 0 || dp[i - coin] == 0) {
          continue;
        }

        if (dp[i] == 0) {
          dp[i] = dp[i - coin] + 1;
        } else {
          dp[i] = Math.min(dp[i], dp[i - coin] + 1);
        }
      }
    }

    if (dp[amount] != 0) {
      return dp[amount];
    }

    return -1;
  }
}
