package DAY3.Polymorphism.CompileTimePoly;

public class OverloadingMain {
    OverloadingMain() {

    }

    public static void main(String[] args) {
        System.out.println("Main Method");

        main(10);

    }

    static void main(int a) {
        System.out.println("Overloaded main");
    }
}
