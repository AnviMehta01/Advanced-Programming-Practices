package week6;

class Account {
    String accountNumber;
    String accountHolder;
    double balance;

    Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs." + balance);
    }
}

class SavingsAccount extends Account {

    SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    void displayDetails() {
        System.out.println("Savings Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs." + balance);
    }
}

class CurrentAccount extends Account {

    CurrentAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    void displayDetails() {
        System.out.println("Current Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs." + balance);
    }
}

interface Payment {
    void pay(double amount);
}

interface SecurePayment extends Payment {
    void verifyPayment();
}

interface OnlineTransaction {
}

class UPIPayment implements SecurePayment, OnlineTransaction {

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI.");
    }

    @Override
    public void verifyPayment() {
        System.out.println("UPI payment verified successfully.");
    }
}

class CardPayment implements Payment, OnlineTransaction {

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Card.");
    }
}

public class OnlineBanking {
    public static void main(String[] args) {

        // Runtime polymorphism
        Account account;

        account = new SavingsAccount("S001", "Anvi", 25000);
        account.displayDetails();

        System.out.println();

        account = new CurrentAccount("C001", "Rahul", 50000);
        account.displayDetails();

        System.out.println();

        // Payment
        Payment payment;

        payment = new UPIPayment();
        payment.pay(2000);

        UPIPayment upi = new UPIPayment();
        upi.verifyPayment();

        System.out.println();

        payment = new CardPayment();
        payment.pay(5000);

        System.out.println();

        // Tagging interface
        if (payment instanceof OnlineTransaction) {
            System.out.println("Card payment is an online transaction.");
        }

        if (upi instanceof OnlineTransaction) {
            System.out.println("UPI payment is an online transaction.");
        }
    }
}
