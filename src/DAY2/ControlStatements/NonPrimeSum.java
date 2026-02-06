package DAY2.ControlStatements;

import java.util.Scanner;

public class NonPrimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        do {
            int digit = n % 10;
            if (digit == 0 || digit == 1 || digit == 4 || digit == 6 ||
                    digit == 8 || digit == 9) {
                sum += digit;
            }
            n = n / 10;
        } while (n > 0);

        System.out.println(sum);
        sc.close();
    }
}
