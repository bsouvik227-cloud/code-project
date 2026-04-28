/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// Bank Interface
interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

// Customer class
class Customer {
    String name;
    int customerId;

    void getCustomerDetails(String name, int id) {
        this.name = name;
        this.customerId = id;
    }

    void showCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerId);
    }
}

// Account class implementing Bank
class Account extends Customer implements Bank {
    double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void showAccountDetails() {
        showCustomerDetails();
        System.out.println("Balance: " + balance);
    }
}

// Main class
public class BankDemo {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.getCustomerDetails("Alice", 101);
        acc.deposit(5000);
        acc.withdraw(1500);

        acc.showAccountDetails();
    }
}