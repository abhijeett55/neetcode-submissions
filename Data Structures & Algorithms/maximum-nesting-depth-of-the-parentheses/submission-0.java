class Solution {
    public int maxDepth(String s) {
        int ones = 0;
        Stack<Character> stk = new Stack();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                stk.push(ch);
                ones = Math.max(ones, stk.size());
            } else if(ch == ')') {
                stk.pop();
            }
        }
        return ones;
    }
}