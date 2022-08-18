package banking;

public class BankAccount {

    private double balance;

    public BankAccount() {
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit (double amount) {
        if (amount > 5000) {
            System.out.println("Transaction canceled. Max deposit - 5000 | Your deposit: " + amount);
        } else {
            this.balance += amount;
        }
    }

    public void withdraw (double amount) {
        if (balance < amount) {
            System.out.println("There is not enough funds.");
        } else {
            this.balance -= amount;
        }
    }

    public void printBalance() {
        System.out.println("Current balance is: " + balance);
    }

    public void transferFrom(BankAccount anotherAccount, double amount) {
        if (balance < amount) {
            System.out.println("Transfer canceled. You are trying to transferFrom "+ amount +" units, but only "+ balance +" are available.");
        } else {
            anotherAccount.deposit(amount);
            this.withdraw(amount);
        }
    }

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount(1000);
        BankAccount bankAccount2 = new BankAccount(2000);

        bankAccount1.withdraw(2000);
        bankAccount1.deposit(7000);
        bankAccount1.transferFrom(bankAccount2,1500);
        bankAccount1.printBalance();
        bankAccount2.printBalance();
    }
}