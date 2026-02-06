package DAY4.Arrays;

import java.util.Scanner;

// Example 1:Input:speeds=[1,2,3,4] Output:score=[24,12,8,6]

public class ProductExceptSelf {
    public static int[] PES(int[] speeds) {
        int n = speeds.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = 1;
        right[n - 1] = 1;
        // Prefix Profuct
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * speeds[i - 1];
        }
        // Suffix Product
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * speeds[i + 1];
        }
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the N value");
        int n = sc.nextInt();
        int[] speeds = new int[n];
        System.out.println("Enter the inputs");
        for (int i = 0; i < n; i++) {
            speeds[i] = sc.nextInt();
        }
        int[] score = PES(speeds);
        System.out.println("The PES");
        for (int i = 0; i < n; i++) {
            System.out.println(score[i] + " ");
        }
        sc.close();
    }

}
