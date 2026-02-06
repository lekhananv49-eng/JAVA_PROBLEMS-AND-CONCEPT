package DAY3.Inheritance;

interface Vehicle {
    static void start() {
        System.out.println("Scooter Started");
    }

    default void kick() {
        System.out.println("Scooter Started using Kicker");
    }
}

class Engine implements Vehicle {
    @Override // Static method in interface connot be overriden
    public void start() {
        System.out.println("Scooter Engine");
    }

    @Override
    public void kick() {
        System.out.println("Scooter Kick Engine");
    }

}

public class DefinitionInInterface {
    public static void main(String[] args) {
        Engine e = new Engine();
        e.start();

    }

}
