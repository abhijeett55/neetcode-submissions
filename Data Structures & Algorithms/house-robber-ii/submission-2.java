class Solution {
    public int solve(int[]nums, int start, int end) {
        int take1 = 0, take2 = 0;
        for(int i = start; i < end; i++) {
            int curr = Math.max(nums[i]+ take2, take1);
            take2 = take1;
            take1 = curr;
        }
        return take1;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int x = solve(nums, 0, n-1);
        int y = solve(nums, 1, n);

        return Math.max(x, y);
    }
}
