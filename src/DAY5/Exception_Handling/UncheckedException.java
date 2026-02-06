package DAY5.Exception_Handling;

// UncheckedException
// Example Classes: 
// 1.ArithmaticException
// 2.ArrayIndexOutOfBounds
// 3.NumberFormatException
// 4.ClassCastException

public class UncheckedException {
    public static void main(String bavi[]) {
        try {
            Object o = "TESTING";
            Integer num = (Integer) o;
            System.out.println("Number: " + num);
        } catch (ClassCastException e) {
            System.out.println("Wrong Casting");
        }
        System.out.println("stoped");

    }
}
