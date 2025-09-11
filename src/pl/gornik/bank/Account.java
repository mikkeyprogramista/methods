package pl.gornik.bank;

import java.util.Objects;
import java.util.UUID;

public class Account {
    private final UUID number;
    private double balance;

    public Account() {
        this.number = UUID.randomUUID();
        this.balance = 0.00;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit succeed!");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal succeed!");
        }
        else System.out.println("You don't have enough money!");
    }

    public UUID getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(balance, account.balance) == 0 && Objects.equals(number, account.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, balance);
    }
}
