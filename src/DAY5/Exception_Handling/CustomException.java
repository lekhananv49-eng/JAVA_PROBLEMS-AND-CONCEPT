package DAY5.Exception_Handling;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

class InvalidMarksException extends Exception {
    public InvalidMarksException(String msg) {
        super(msg);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int age = 15;
        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be above 18!");
            }
            System.out.println("Eligible");
        } catch (InvalidAgeException e) {
            System.out.println("Exception " + e.getMessage());
        }

        int marks = -1;

        try {
            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("invalid Marks");
            }
        } catch (InvalidMarksException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}
