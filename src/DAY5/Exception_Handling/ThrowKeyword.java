package DAY5.Exception_Handling;

// To create and throw exceptions Manually inside a block or fun

public class ThrowKeyword {
    public static void main(String[] args) {

        int age = 15;
        if (age < 18) {
            throw new ArithmeticException("Not Eligible to vote");
        }
        System.out.println("Eligible to vote");
    }
}
