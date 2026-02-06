package DAY1;

import java.util.Scanner;

public class CricketStadium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght and breadth");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int ropeLength = 2 * (length + breadth);
        int carpetArea = length * breadth;
        System.out.println("Rope Lenghth" + ropeLength);
        System.out.println("Carpet Area" + carpetArea);
        sc.close();
    }
}
