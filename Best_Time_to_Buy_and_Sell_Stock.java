import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Best_Time_to_Buy_and_Sell_Stock{
    public static int maximumProfit(ArrayList<Integer> prices){
        int min = prices.get(0);
        int max =0;
        for (int index = 0; index < prices.size(); index++) {
           int currentprice = prices.get(index);
           int profit = currentprice - min;
           max = Math.max(max, profit);
           min = Math.min(min, currentprice);
        }
        return max;
    }
}
