package DAY5.Collections1;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        Set<Integer> haSet = new HashSet<>();
        haSet.add(50);
        haSet.add(10);
        haSet.add(30);
        haSet.add(10);
        haSet.add(40);
        System.out.println("Set Output: " + haSet);

        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(50);
        lhs.add(10);
        lhs.add(30);
        lhs.add(10);
        lhs.add(40);
        System.out.println("LHashedSet: " + lhs);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(40);
        System.out.println("TreeSetOrder: " + treeSet);

    }

}
