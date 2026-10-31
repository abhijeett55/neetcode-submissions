class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int buyed = prices[0] + prices[1];
        return money >= buyed ? money - buyed : money;
    }
}