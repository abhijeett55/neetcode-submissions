class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        for(int i = 0; i < n; i++) {
            for(int c = coins[i]; c <= amount; c++) {
                dp[c] = Math.min(dp[c], dp[c - coins[i]] + 1);
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}
