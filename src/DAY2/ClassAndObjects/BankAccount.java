package DAY2.ClassAndObjects;

import java.util.Scanner;

public class BankAccount {

    static class Bank {
        private String accountHoldername;
        private double balance;

        Bank(String accountHoldername, double balance) {
            this.accountHoldername = accountHoldername;
            this.balance = balance;
        }

        public String getAccountHolderName() {
            return accountHoldername;
        }

        public void setAccountHolderName(String name) {
            this.accountHoldername = name;
        }

        public void deposit(double amt) {
            if (amt > 0) {
                balance = balance + amt;
            }
        }

        public void withdraw(double amt) {
            if (amt > 0 && amt <= balance)
                balance = balance - amt;
        }

        public double getbalance() {
            return balance;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Holder Details:");
        String Hname = sc.nextLine();
        double initialBalance = sc.nextDouble();
        sc.nextLine();
        String op = sc.nextLine();
        double amt = sc.nextDouble();
        Bank b = new Bank(Hname, initialBalance);

        if (op.equals("deposit")) {
            b.deposit(amt);
        } else if (op.equalsIgnoreCase("withdraw")) {
            b.withdraw(amt);
        }

        System.out.println("Holder Name: " + b.getAccountHolderName()

                + " Balance: " + b.getbalance());
        sc.close();
    }
}
