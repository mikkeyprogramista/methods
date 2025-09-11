package pl.gornik.bank;

import java.util.Objects;
import java.util.UUID;

public class CreditCard {
    private final UUID number;
    private final Account account;
    private double limit;

    public CreditCard(Account account) {
        this.number = UUID.randomUUID();
        this.account = account;
        this.limit = 0.00;
    }

    public void changeLimit(double limit) {
        if (this.limit == limit) System.out.println("Limit cannot be the same!");
        else if (limit >= 0.00) {
            this.limit = limit;
            System.out.println("Limit changed!");
        }
        else System.out.println("Limit cannot be lower than 0.00!");
    }

    public void withdraw(double amount) {
        if (amount > limit) System.out.println("Amount cannot be bigger than the limit!");
        else if (amount > account.getBalance()) System.out.println("You don't have enough money!");
        else account.withdraw(amount);
    }

    public UUID getNumber() {
        return number;
    }

    public double getLimit() {
        return limit;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number=" + number +
                ", account=" + account +
                ", limit=" + limit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return Double.compare(limit, that.limit) == 0 && Objects.equals(number, that.number) && Objects.equals(account, that.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, account, limit);
    }
}
