class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int x: nums) {
            s.add(x);
        }

        return s.size() != nums.length;
    }
}