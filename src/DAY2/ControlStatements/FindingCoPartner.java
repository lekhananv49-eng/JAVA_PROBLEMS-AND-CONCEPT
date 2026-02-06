package DAY2.ControlStatements;

import java.util.Scanner;

public class FindingCoPartner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int Relation = n % 8;

        if (Relation == 1) {
            System.out.println((n + 3) + "LB");
        } else if (Relation == 2) {
            System.out.println((n + 3) + "MB");
        } else if (Relation == 3) {
            System.out.println((n + 3) + "UB");
        } else if (Relation == 4) {
            System.out.println((n - 3) + "LB");
        } else if (Relation == 5) {
            System.out.println((n - 3) + "MB");
        } else if (Relation == 6) {
            System.out.println((n - 3) + "UB");
        } else if (Relation == 7) {
            System.out.println((n + 1) + "SU");
        } else {
            System.out.println((n - 1) + "SL");
        }
    }
}
