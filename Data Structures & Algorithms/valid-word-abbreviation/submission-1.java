class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        
        int x = 0, y = 0;
        int n = word.length(), m = abbr.length();
        while( x < n && y < m) {
            if(abbr.charAt(y) == '0') return false;
            if(Character.isLetter(abbr.charAt(y))) {
                if(x < n && word.charAt(x) == abbr.charAt(y)) {
                    x++;
                    y++;
                } else {
                    return false;
                }
            } else {
                int len = 0;
                while(y < m && Character.isDigit(abbr.charAt(y))) {
                    len = len *10 + (abbr.charAt(y)- '0');
                    y++;
                }

                x += len;
            }
        }

        return x == n && y == m;
    }
}