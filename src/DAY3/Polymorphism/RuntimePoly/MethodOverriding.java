package DAY3.Polymorphism.RuntimePoly;

class Animal {
    void sound() {
        System.out.println("Animal Makes a sound");
    }

    void print() {
        System.out.println("Animal");
    }
}

class Bhima extends Animal {
    @Override
    void sound() {
        System.out.println("Umhhh");
    }

}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Bhima();
        Animal a1 = new Animal();
        Bhima b = new Bhima();

        // Bhima b = new Animal();
        a.print();
        a.sound();

    }

}
