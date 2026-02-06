package DAY4.Arrays;

import java.util.Arrays;

// prices = [12, 3, 4, 1, 6, 9]
// budget = 24
public class Tripplets {
    public static void CheckTriplet(int[] prices, int budget) {
        Arrays.sort(prices);
        int n = prices.length;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            // prices = [1, 2, 3, 4, 5]
            // budget = 12
            while (left < right) {
                int sum = prices[i] + prices[left] + prices[right];
                if (sum == budget) {
                    System.out.println("Triplet Found: " + prices[i] + "," + prices[left] + "," + prices[right]);
                    return;
                } else if (sum < budget) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println("No found");

    }

    public static void main(String[] args) {

    }
}
