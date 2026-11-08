class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] dp = new int[n];
        int buyed = prices[0];

        for(int i = 1; i < n; i++) {
            int profit = prices[i] - buyed;
            if(profit >= 0) { dp[i] = Math.max(profit, dp[i-1]); }
            else { buyed = prices[i]; dp[i] = dp[i-1]; } 
        }

        return dp[n-1];
    }
}
