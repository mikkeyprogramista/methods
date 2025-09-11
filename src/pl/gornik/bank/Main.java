package pl.gornik.bank;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- ACCOUNT -----");
        Account account = new Account();
        System.out.println(account);

        account.deposit(100);
        System.out.println(account);

        account.withdraw(50);
        System.out.println(account);

        account.withdraw(10000);
        System.out.println(account);

        System.out.println("Account number: " + account.getNumber());
        System.out.println("Account balance: " + account.getBalance());

        System.out.println("");
        System.out.println("----- ACCOUNT -----");
        CreditCard card = new CreditCard(account);
        System.out.println(card);

        card.changeLimit(30);
        System.out.println(card);

        card.withdraw(50);
        System.out.println(card);

        card.withdraw(30);
        System.out.println(card);

        card.withdraw(30);
        System.out.println(card);
    }
}
