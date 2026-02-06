package DAY3.Inheritance;

class Parent {

    Parent(int x) {
        System.out.println("Parent value: " + x);
    }
}

class Child extends Parent {

    Child() {
        super(10);
        System.out.println("Child contructor ");
    }
}

public class ConstructerChainingUsingSuper {
    public static void main(String[] args) {

    }

}
