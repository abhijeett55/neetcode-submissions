class Solution {
    public int characterReplacement(String s, int k) {
        HashSet<Character> mp = new HashSet<>();
        int ans = 0;
        for(char ch: s.toCharArray()) {
            mp.add(ch);
        }

        for(char c: mp) {
            int move = 0, left = 0;
            for(int right = 0; right < s.length(); right++) {

                if(s.charAt(right) == c) move++;

                while((right - left + 1) - move > k) {
                    if(s.charAt(left) == c) move--;
                    left++;
                }

                ans = Math.max(ans, right - left + 1);
            }
        }

        return ans;
    }
}
