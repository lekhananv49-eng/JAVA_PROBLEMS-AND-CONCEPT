package DAY1;

import java.util.Scanner;

public class SumOfTwoDigits {
    public static void main(String[] args) {
        System.out.println("Enter the digit: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int F = n / 10;
        int E = n % 10;
        int sum = F + E;
        System.out.printf("\nSum=%d", sum);
        sc.close();
    }
}
