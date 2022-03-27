package LeetCode;

public class BuyAndSellStockProfit {

    public static void main(String[] args) {

    int[] prices = new int[] {7,1,5,3,6,4};

        System.out.println(BuyAndSellStockProfit.maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        if(prices.length == 0) {
            return  0;
        }

        int minSofar = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if(prices[i] < minSofar) {
                minSofar = prices[i];
            }

            System.out.println("----minSofar----");
            System.out.println(minSofar);

            if(prices[i] - minSofar > maxProfit) {

                System.out.println(maxProfit);
                maxProfit = prices[i] - minSofar;
            }
        }

        return maxProfit;



    }
}
