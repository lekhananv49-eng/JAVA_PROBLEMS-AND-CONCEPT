package DAY4.Practice;

// Sample Input
// 40 123
// 55 200
// 33 400
// Sample output:
// 43.68

import java.util.Scanner;

class CurrentBill {
    public double amount() {
        return 0.0;
    }
}

// No virtual keyword in java
class Fan extends CurrentBill {
    public double watts;
    public double hours;

    Fan(double watts, double hours) {
        this.watts = watts;
        this.hours = hours;
    }

    @Override
    public double amount() {
        return (watts * hours) / 1000.0;
    }
}

class Light extends CurrentBill {
    public double watts;
    public double hours;

    Light(double watts, double hours) {
        this.hours = hours;
        this.watts = watts;
    }

    @Override
    public double amount() {
        return (watts * hours) / 1000;
    }
}

class TV extends CurrentBill {
    public double watts;
    public double hours;

    TV(double watts, double hours) {
        this.hours = hours;
        this.watts = watts;
    }

    @Override
    public double amount() {
        return (watts * hours) / 1000;
    }
}

public class CurrentBillProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter for fan: ");
        double fw = sc.nextDouble();
        double fh = sc.nextDouble();
        System.out.println("Enter for light");
        double lw = sc.nextDouble();
        double lh = sc.nextDouble();
        System.out.println("Enter for tv");
        double tvw = sc.nextDouble();
        double tvh = sc.nextDouble();

        CurrentBill fan = new Fan(fw, fh);
        CurrentBill light = new Light(lw, lh);
        CurrentBill tv = new TV(tvw, tvh);

        double totalUnits = fan.amount() + light.amount() + tv.amount();
        double costPrice = 1.5;
        double totalBill = totalUnits * costPrice;
        System.out.println("The totalBill: " + totalBill);
        sc.close();
    }

}
