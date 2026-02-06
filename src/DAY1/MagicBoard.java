package DAY1;

import java.util.Scanner;

public class MagicBoard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Values");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int n4 = in.nextInt();
        System.out.println(n1 + "-" + (char) n1);
        System.out.println((char) n2);
        System.out.println((char) n3);
        System.out.println((char) n4);
        in.close();
    }
}
