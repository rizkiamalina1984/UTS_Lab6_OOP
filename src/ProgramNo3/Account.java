package ProgramNo3;

public class Account {
    private String id;
    private String name;
    private int balance;

    // Constructor with id and name, default balance to 0
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    // Constructor with id, name, and balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getters
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // Method to credit amount to balance
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    // Method to debit amount from balance
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Method to transfer amount to another account
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // toString method to represent the account information as a string
    @Override
    public String toString() {
        return String.format("Account[id=%s,name=%s,balance=%d]", id, name, balance);
    }
}
