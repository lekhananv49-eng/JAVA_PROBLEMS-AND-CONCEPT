package DAY4.Strings;

import java.util.Scanner;

import javax.print.DocFlavor.READER;

public class RomanToInt {
    static int value(char ch) {
        if (ch == 'I') {
            return 1;
        }
        if (ch == 'V') {
            return 5;
        }
        if (ch == 'X') {
            return 10;
        }
        if (ch == 'L') {
            return 50;
        }
        if (ch == 'C') {
            return 100;
        }
        if (ch == 'D') {
            return 500;
        }
        if (ch == 'M') {
            return 1000;
        }
        return 0;
    }

    static int romanToInteger(StringBuilder sb) {
        int total = 0;
        for (int i = 0; i < sb.length(); i++) {
            int curr = value(sb.charAt(i));
            if (i < sb.length() - 1) {
                int next = value(sb.charAt(i + 1));

                if (curr < next) {
                    total = total - curr;
                } else {
                    total = total + curr;
                }
            } else {
                total += curr;
            }
        }
        return total;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ROMAN value: ");
        String input = sc.nextLine().trim();
        StringBuilder sb = new StringBuilder(input);
        System.out.println(romanToInteger(sb));
        sc.close();

    }
}
