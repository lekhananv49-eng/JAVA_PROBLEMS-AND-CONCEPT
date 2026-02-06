package DAY2.ClassAndObjects;

import java.util.Scanner;

class Employee {
    private String name;
    public Double Salary;

    public void setName(String name) {
        this.name = name;
    }

    Employee() {

    }

    public String getName() {
        return name;
    }
}

public class CompanyEmployee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name:Salary:NewSalary");
        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double newSalary = sc.nextDouble();

        Employee e = new Employee();
        // e.Salary = 100.0;
        e.setName(name);
        System.out.println(e.getName());

    }
}
