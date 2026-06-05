class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length, res = 2;
        if(n <= 2) return n;

        for(int i = 2; i < n; i++) {
            if(nums[i] != nums[res - 2]) {
                nums[res] = nums[i];
                res++;
            }
        }
        return res;
    }
}