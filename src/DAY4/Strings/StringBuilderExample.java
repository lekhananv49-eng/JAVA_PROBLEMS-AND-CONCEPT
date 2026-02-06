package DAY4.Strings;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Start");
        System.out.println("First value: " + sb);

        // 2) Append()
        sb.append("Programming");
        System.out.println("After Append: " + sb);
        // 3)Insert(a,b)
        sb.insert(5, " With ");
        System.out.println("Using Insert: " + sb);
        // 4) replace
        sb.replace(0, 5, "Begin");
        System.out.println("After Replacing: " + sb);
        // 5)delete()
        sb.delete(6, 11);
        System.out.println("After delete: " + sb);
        // revese()
        sb.reverse();
        System.out.println("After Reverse: " + sb);

        sb.capacity();
        System.out.println("Capacity: " + sb.capacity());

    }
}
