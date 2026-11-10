class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs) {
            sb.append(str.length()).append('#').append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> ans = new ArrayList<>();
        int intial = 0;
        while(intial < str.length()) {
            int next = intial;
            while(str.charAt(next) != '#') {
                next++;
            }

            int length = Integer.parseInt(str.substring(intial, next));
            intial = next + 1;
            next = intial + length;
            ans.add(str.substring(intial, next));
            intial = next;
        }

        return ans;
        
    }
}
