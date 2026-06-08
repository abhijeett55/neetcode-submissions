class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int x = 0, y = 0;
        int n = g.length, m = s.length;
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(x < n && y < m) {
            if(s[y] >= g[x]) {
                count++;
                x++;
                y++;
            } else {
                y++;
            }
        }

        return count;
       
    }
}