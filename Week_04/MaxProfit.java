package week04;

/**
 * 122. 买卖股票的最佳时机 II
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 *
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 */
public class MaxProfit {

    public static void main(String[] args) {
        int[] prices1={7,1,5,3,6,4};
        int[] prices2={1,2,3,4,5};
        int[] prices3={7,6,4,3,1};
        System.out.println(new MaxProfit().maxProfit(prices1));
        System.out.println(new MaxProfit().maxProfit(prices2));
        System.out.println(new MaxProfit().maxProfit(prices3));
    }
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}
