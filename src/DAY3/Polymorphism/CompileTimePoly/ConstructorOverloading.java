package DAY3.Polymorphism.CompileTimePoly;

public class ConstructorOverloading {
    int rollno;
    String name;

    ConstructorOverloading() {
        rollno = 0;
        name = "Unkown";
    }

    ConstructorOverloading(int r) {
        rollno = r;
        name = "Bavi";
    }

    ConstructorOverloading(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name);
    }

    public static void main(String[] args) {
        ConstructorOverloading c1 = new ConstructorOverloading(101, "Uma");
        c1.display();
    }

}
