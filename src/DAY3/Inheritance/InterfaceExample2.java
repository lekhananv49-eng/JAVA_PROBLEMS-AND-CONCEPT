package DAY3.Inheritance;

interface Bank {
    final double RATE = 8.5;
}

class CANARA implements Bank {

    void showRate() {
        RATE = 5.9839;
        System.out.println(RATE);

    }
}

public class InterfaceExample2 {
    public static void main(String[] args) {
        CANARA c = new CANARA();
        c.showRate();
    }

}
