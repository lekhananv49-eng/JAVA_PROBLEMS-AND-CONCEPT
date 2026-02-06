package DAY5.Collections1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> number = new LinkedList<>();

        names.add("Tharun");
        names.add("Karan");

        System.out.println("After add(): " + names);
        names.add(1, "Poojana");
        System.out.println("After Index add(): " + names);
        names.set(2, "Lali Roy");
        System.out.println("After Set(): " + names);
        System.out.println("Using For loop");
        for (String n : names) {
            System.out.println(n);
        }
        System.out.println("Using Iterator\n");
        Iterator<String> i = names.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
