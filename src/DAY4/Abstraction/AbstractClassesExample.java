package DAY4.Abstraction;

abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void start();

    void showBrand() {
        System.out.println("Brand: " + brand);
    }

}

class Scooter extends Vehicle {
    Scooter(String brand) {
        super(brand);
    }

    void start() {
        System.out.println("Starting Scooter Engine");
    }

}

public class AbstractClassesExample {
    public static void main(String[] args) {
        Vehicle v1 = new Scooter("TVS");
        // Vehicle v2 = new
        v1.showBrand();
        v1.start();

    }

}
