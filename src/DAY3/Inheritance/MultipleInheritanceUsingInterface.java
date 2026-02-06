package DAY3.Inheritance;

interface Father {
    void show();
}

interface Mother {
    void print();
}

class daughter implements Father, Mother {
    public void show() {
        System.out.println("Show from A");
    }

    public void print() {
        System.out.println("Print from B");
    }
}

public class MultipleInheritanceUsingInterface {

    public static void main(String[] args) {
        daughter d = new daughter();
        d.show();
        d.print();

    }

}
