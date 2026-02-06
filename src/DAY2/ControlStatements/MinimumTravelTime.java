package DAY2.ControlStatements;

import java.util.Scanner;

public class MinimumTravelTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values: ");
        int N = sc.nextInt();
        int V1 = sc.nextInt();
        int V2 = sc.nextInt();
        double timeUsingStairs = (Math.sqrt(2) * N) / V1;
        double timeUsingElevator = (2.0 * N) / V2;

        if (timeUsingElevator < timeUsingStairs) {
            System.out.println("Elevator");
        } else {
            System.out.println("Stairs");
        }
        sc.close();
    }
}
