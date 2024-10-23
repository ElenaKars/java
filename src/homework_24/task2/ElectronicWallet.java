package homework_24.task2;

public class ElectronicWallet implements PaymentSystem{
    String currencyEW;
    double balanceEW;

    public ElectronicWallet(String currencyEW, double balanceEW) {
        this.currencyEW = currencyEW;
        this.balanceEW = balanceEW;
    }

    @Override
    public void withdrawMoney(double amount) {
        if(balanceEW > amount) {
            balanceEW -= amount;
            System.out.printf("Withdraw E-money: %.2f %s\n", amount, currencyEW);
            System.out.printf("The balance after withdraw from E-wallet: %.2f %s\n", balanceEW, currencyEW);
        } else {
            System.out.println("Not enough balance");
        }

    }

    @Override
    public void depositTransfer(double amount) {
        balanceEW += amount;
        System.out.printf("E-deposit: %.2f %s\n", amount, currencyEW);
        System.out.printf("The E-balance after deposit: %.2f %s\n", balanceEW, currencyEW);

    }

    @Override
    public void checkBalance() {
        System.out.printf("Balance: %.2f %s\n", balanceEW,currencyEW);

    }
}
