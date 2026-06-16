class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[] dp = new int[amount+1];
        dp[0] = 1;
        
        for(int i = 0; i < n; i++) {
            for(int s = coins[i]; s <= amount; s++) {
                dp[s] = dp[s] + dp[s - coins[i]];
            }
        }

        return dp[amount];
    }
}
