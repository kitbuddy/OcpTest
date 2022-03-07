package buyingAndSellingStocks;

/*The cost of a stock on each day is given in an array, find the max profit that you can make by
buying and selling in those days. For example, if the given array is {100, 180, 260, 310, 40, 535, 695},
the maximum profit can earned by buying on day 0, selling on day 3. Again buy on day 4 and sell on day 6.
If the given array of prices is sorted in decreasing order, then profit cannot be earned at all.
*/
public class buyingAndSellingStocks {


    public static void main(String[] args) {
        int[] inputArray =  {100, 180, 260, 310, 40, 535, 695};

        System.out.println(buyingAndSellingStocks.getMaxProfit(inputArray, 0, inputArray.length));
    }

    private static int getMaxProfit(int[] inputArray, int start, int end) {

        int profit = 0;

        for (int i = start; i < end; i++) {

         for (int j = i+1; j < end; j++) {

             if (inputArray[i] > inputArray[i+1]) {

             }
         }
        }


        return profit;
    }

}
