package DAY3.Polymorphism.CompileTimePoly;

class Demo {
    void show(long a) {
        System.out.println("long");
    }

    void show(float a) {
        System.out.println("Float");
    }
}

public class TypePromotion {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show(10);

    }
}
