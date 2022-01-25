import java.util.Arrays;
import java.util.List;

public class SharesBuyingSelling {



    public static int FinalProfitOrLoss( List<Integer> sharesPriceList) {
        int lastBuyingPrice =sharesPriceList.get(0);
        int finalLossOrProfit = 5 * sharesPriceList.get(0);

        for (int i = 0; i < sharesPriceList.size()-1; i++) {

            if(sharesPriceList.get(i) > sharesPriceList.get(i+1) && sharesPriceList.get(i + 1) <= lastBuyingPrice) {
                    System.out.println("last buying Price " + lastBuyingPrice);
                    System.out.println("sharesPriceList.get(i + 1) " + sharesPriceList.get(i + 1));

                    lastBuyingPrice = sharesPriceList.get(i+1);
                    finalLossOrProfit += (5 * sharesPriceList.get(i + 1));
                }
                System.out.println(finalLossOrProfit);
                System.out.println("--------");
            }
//        System.out.println(finalLossOrProfit/5);

        return 0;
    }

    public static void main(String[] args) {

        // 100 + 50 + 25 = 175/5
        List<Integer> sharesPriceList = Arrays.asList(20, 10, 30, 20, 5);

        SharesBuyingSelling.FinalProfitOrLoss(sharesPriceList);
    }
}
