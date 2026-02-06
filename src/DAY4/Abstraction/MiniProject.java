package DAY4.Abstraction;

import java.util.Scanner;

abstract class Payment {
    private String customerName;
    private double amount;

    Payment(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    abstract void validate();

    abstract void proccesPayment();

    void printReceipt() {
        System.out.println("Payement Receipt");
        System.out.println("Customer: " + customerName);
        System.out.println("Amount: " + amount);
        System.out.println("Status:  SUCCESS");
    }

    public void makePayment() {
        validate();
        proccesPayment();
        printReceipt();
    }
}

class UPI extends Payment {
    private String upiId;

    UPI(String cutormerName, double amount, String upiId) {
        super(cutormerName, amount);
        this.upiId = upiId;
    }

    void validate() {
        if (upiId.contains("@") && getAmount() > 0) {
            System.out.println("UPI VALIDATION SUCCESSFULL");
        } else {
            System.out.println("INVALID UPI ID");
        }
    }

    void proccesPayment() {
        System.out.println("Proccessing UPI payment to :" + upiId);
    }
}

class Card extends Payment {
    private String cardNumber;

    public Card(String customerName, double amount, String cardNumber) {
        super(customerName, amount);
        this.cardNumber = cardNumber;
    }

    public void validate() {
        if (cardNumber.length() == 16 && getAmount() > 0) {
            System.out.println("Card Validation Success");
        } else {
            System.out.println("Invalid Card Details");

        }

    }

    public void proccesPayment() {
        System.out.println("Proccessing Card Payment: " + cardNumber.substring(6));
    }
}

class Cash extends Payment {
    private double cashBalance;

    public Cash(String customerName, double amount, double cashBalance) {
        super(customerName, amount);
        this.cashBalance = cashBalance;
    }

    public void validate() {
        if (cashBalance >= getAmount() && getAmount() > 0) {
            System.out.println("Cash Validation Success");
        } else {
            System.out.println("No balance in cash");
        }
    }

    public void proccesPayment() {
        cashBalance = cashBalance - getAmount();
        System.out.println("Processing Cash Balance");
        System.out.println("Remaining Balance: " + cashBalance);
    }
}

public class MiniProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MINI PAYMENT SYSTEM");
        System.out.println("Enter customer Name");
        String name = sc.nextLine();
        System.out.println("Enter the Amount");
        double amount = sc.nextDouble();

        System.out.println("Enter the payment Method");
        System.out.println("1.UPI\n2.CARD\n3.CASH");
        System.out.println("Enter Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        Payment p = null;
        if (choice == 1) {
            System.out.println("Enter the UPI ID");
            String upi = sc.nextLine();
            p = new UPI(name, amount, upi);
        } else if (choice == 2) {
            System.out.println("Enter Card number");
            String card = sc.nextLine();
            p = new Card(name, amount, card);
        } else if (choice == 3) {
            System.out.println("Enter Cash Balance");
            double balance = sc.nextDouble();
            p = new Cash(name, amount, balance);
        } else {
            System.out.println("Invalid choice");

        }
        p.makePayment();
        sc.close();
    }
}
