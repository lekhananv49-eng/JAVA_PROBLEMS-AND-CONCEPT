package DAY3.Inheritance;

class Parent {
    Parent() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child");
    }

}

class Child2 extends Child {
    Child2() {
        System.out.println("Child2");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        new Child2();
    }
}
