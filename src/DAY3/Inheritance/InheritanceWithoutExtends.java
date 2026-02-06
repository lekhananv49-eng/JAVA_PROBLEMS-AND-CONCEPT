package DAY3.Inheritance;

class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }
}

class Student {
    String name;
    Teacher t;

    Student(String name, Teacher t) {
        this.name = name;
        this.t = t;
    }
}

public class InheritanceWithoutExtends {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Manvith");
        Student s = new Student("Bavii", t1);

        s.t = t1;
        System.out.println(s.t.name);
        System.out.println(s.name);

    }
}
