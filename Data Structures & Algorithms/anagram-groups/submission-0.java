class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> ans = new HashMap<>();
        for(String s: strs) {
            int[] alp = new int[26];
            for(char c: s.toCharArray()) {
                alp[c - 'a']++;
            }

            String check = Arrays.toString(alp);
            ans.putIfAbsent(check, new ArrayList<>());
            ans.get(check).add(s);

        }
        return new ArrayList<>(ans.values());
    }
}
