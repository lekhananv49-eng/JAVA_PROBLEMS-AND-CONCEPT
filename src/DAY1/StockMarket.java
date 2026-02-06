package DAY1;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float prevPrice = sc.nextFloat();
        float currPrice = sc.nextFloat();
        float perChange = ((currPrice - prevPrice) / prevPrice) * 100;
        if (perChange > 10) {
            System.out.println("Buy");
        } else if (perChange >= -5) {

            System.err.println("Hold");
        } else {
            System.out.println("Sell");
        }
        sc.close();
    }

}
