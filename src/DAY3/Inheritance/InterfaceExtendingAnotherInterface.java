package DAY3.Inheritance;

interface A {
    void show();
}

interface B extends A {
    void print();
}

class Unique implements B {
    public void print() {
        System.out.println("Interface B");
    }

    public void show() {
        System.out.println("Interface A");
    }

}

public class InterfaceExtendingAnotherInterface {
    public static void main(String[] args) {

    }
}
