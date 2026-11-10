class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> store = new HashMap<>();
        for(int num: nums) {
            store.put(num , store.getOrDefault(num, 0)+1);
        }

        ArrayList<int[]> en = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: store.entrySet()) {
            en.add(new int[] {entry.getValue(), entry.getKey()});
        }

        en.sort((a, b) -> b[0] - a[0]);
        int[] ans = new int[k];
        for(int i = 0; i < k; i++) {
            ans[i] = en.get(i)[1];
        }

        return ans;
        
    }
}
