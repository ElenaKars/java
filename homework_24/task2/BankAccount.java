package homework_24.task2;

public class BankAccount implements PaymentSystem{
    String currency;
    double balance;

    public BankAccount(String currency, double balance) {
        this.currency = currency;
        this.balance = balance;
    }

    @Override
    public void withdrawMoney(double amount) {
        if(balance > amount) {
            balance -= amount;
            System.out.printf("Withdraw money: %.2f %s\n", amount, currency);
            System.out.printf("The balance after withdraw: %.2f %s\n", balance, currency);
        } else {
            System.out.println("Not enough balance");
        }
    }

    @Override
    public void depositTransfer(double amount) {
        balance += amount;
        System.out.printf("Deposit: %.2f %s\n", amount, currency);
        System.out.printf("The balance after deposit: %.2f %s\n", balance, currency);
    }

    @Override
    public void checkBalance() {
        System.out.printf("Balance: %.2f %s\n", balance, currency);
    }
}
