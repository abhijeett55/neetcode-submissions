class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int x: nums) {
            sum += x;
        }

        if(sum%2 != 0) return false;
        int part = sum / 2;
        boolean[] dp = new boolean[part+1];
        dp[0] = true;
        for(int i = 0; i < nums.length; i++) {
            for(int s = part; s >= nums[i]; s--) {
                dp[s] = dp[s] || dp[s - nums[i]];
            }
        }

        return dp[part];

    }
}
