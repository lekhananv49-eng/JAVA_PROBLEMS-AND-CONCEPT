package DAY3.Inheritance;

interface Animal {
    abstract void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Barks");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
