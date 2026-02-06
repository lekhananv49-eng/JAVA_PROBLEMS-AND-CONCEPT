package DAY5.Collections1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IncreasingSequence {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (list.isEmpty()) {
                list.add(num);
            } else if (num > list.get(list.size() - 1)) {
                list.add(num);
            }

        }
        System.out.println(list);
        sc.close();
    }
}
