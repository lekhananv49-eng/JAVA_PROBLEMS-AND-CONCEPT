package DAY3.Polymorphism.CompileTimePoly;

class Test {
    void show(int a, float b) {
        System.out.println("Varun");
    }

    void show(float a, int b) {
        System.out.println("Arun");
    }
}

public class Ambiguity {
    public static void main(String[] args) {
        Test t = new Test();
        t.show(10, 10);

    }
}
