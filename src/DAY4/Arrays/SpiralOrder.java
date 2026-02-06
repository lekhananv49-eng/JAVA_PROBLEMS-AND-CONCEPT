package DAY4.Arrays;

import java.util.Scanner;

public class SpiralOrder {
    public static void printSpiral(int[][] mat, int rows, int cols) {
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.println(mat[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.println(mat[i][right] + " ");
            }
            right--;
            for (int i = right; i >= left; i--) {
                System.out.println(mat[bottom][i]);
            }
            bottom--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
}
