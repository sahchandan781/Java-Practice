package Day13Array;

public class BestTimeToBuyAndSellTheStock {
    static int maxProfit(int[] prices){
        int minSoFar = prices[0];
        int res = 0;

        //  Update the minimum value seen so far
        //  If we see smaller

        for(int  i = 0; i< prices.length -1; i++){
            minSoFar = Math.min(minSoFar , prices[i]);

            // update result if we get more profit

            res = Math.max(res, prices[i] - minSoFar);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(prices));
    }
}
