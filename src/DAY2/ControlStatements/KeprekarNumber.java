package DAY2.ControlStatements;

import java.util.Scanner;

public class KeprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int square = n * n;
        String s = String.valueOf(square);
        int len = String.valueOf(n).length();
        boolean isKpNumber = false;

        for (int i = 1; i < s.length(); i++) {
            String leftHalf = s.substring(0, i);
            String rightHalf = s.substring(i);

            int left = Integer.parseInt(leftHalf);
            int right = Integer.parseInt(rightHalf);

            if (right != 0 && left + right == n) {
                isKpNumber = true;
                break;
            }
        }

        if (isKpNumber) {
            System.out.println("Yes");
        } else {
            System.out.println("False");
        }
    }

}
