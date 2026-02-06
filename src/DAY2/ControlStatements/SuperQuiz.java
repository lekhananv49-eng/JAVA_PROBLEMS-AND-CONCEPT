package DAY2.ControlStatements;

import java.util.Scanner;

public class SuperQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 10) {
            System.out.println("Invalid Input");
        } else {
            int lasDigit = n % 10;
            int firstDigit = n;
            while (firstDigit >= 10) {
                firstDigit = firstDigit / 10;
            }
            int team = Math.abs(firstDigit - lasDigit);
            System.out.println(team);
        }
        sc.close();
    }
}
