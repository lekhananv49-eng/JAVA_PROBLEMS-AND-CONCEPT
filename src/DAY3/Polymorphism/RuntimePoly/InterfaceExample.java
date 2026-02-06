package DAY3.Polymorphism.RuntimePoly;

interface Payment {
    void pay();
}

class UPI implements Payment {
    public void pay() {
        System.out.println("Payement via UPI");
    }
}

class Card implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment via card");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Payment p;
        p = new UPI();
        p.pay();
        p = new Card();
        p.pay();
    }

}
