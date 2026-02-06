package DAY5.LambdaExpressions;

interface Demo {
    void show();
}

public class LambdaExample {
    public static void main(String[] args) {
        Demo d = () -> System.out.println("Hello Lambda");
        d.show();
    }

}
