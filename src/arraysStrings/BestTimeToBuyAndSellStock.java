package arraysStrings;

public class BestTimeToBuyAndSellStock {

    /*
    You are given an array prices where prices[i] is the price of a given stock on the ith day.

    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     */

    public static void main(String[] args){
        int[] prices1 = new int[] {7,1,5,3,6,4};
        System.out.println(maxProfit(prices1));

        int[] prices2 = new int[] {7,6,4,3,1};
        System.out.println(maxProfit(prices2));
    }

    public static int maxProfit(int[] prices){
        int lowestPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=0; i<prices.length; i++){
            if (prices[i] < lowestPrice){
                lowestPrice = prices[i];
            }
            int currentProfit = prices[i] - lowestPrice;
            maxProfit = Math.max(currentProfit, maxProfit);
        }
        return maxProfit > 0 ? maxProfit : 0;
    }
}
