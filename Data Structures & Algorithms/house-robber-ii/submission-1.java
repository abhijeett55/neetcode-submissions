class Solution {
    public int solve(int[] nums, int index, int end) {
        int prev1 = 0, prev2 = 0;
        for(int i = index; i <= end; i++) {
            int take = prev2 + nums[i];
            int skip = prev1;

            int curr = Math.max(take, skip);

            prev2 = prev1;
            prev1 = curr;

        }
        return prev1;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];

        int case1 = solve(nums, 0, n-2);
        int case2 = solve(nums, 1, n-1);

        return Math.max(case1, case2);
    }
}
