class Solution {
    public boolean check(String s) {
        int left = 0, right = s.length()-1;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        if(check(s)) return true;
        
        for(int i = 0; i < s.length(); i++) {
            String mew = s.substring(0, i) + s.substring(i+1);
            if(check(mew)) return true;
        }

        return false;

    }
}