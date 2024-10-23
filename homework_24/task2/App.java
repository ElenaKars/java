//Task 2
//Платежные системы
//Создайте интерфейс PaymentSystem с методами:
//withdrawMoney(double amount) (снятие со счета) - списываются деньги со счета
//depositTransfer(double amount) (поступление денег на счет);
//checkBalance() (остаток на счете).
//Напишите классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.
//Банк предоставляет счета, например, в евро, а электронный кошелек в другой валюте
//Убедитесь, что каждый класс корректно выполняет каждую из операций.
package homework_24.task2;

public class App {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount("euro", 500);
        bank.depositTransfer(234.5);
        bank.checkBalance();
        bank.withdrawMoney(800);

        ElectronicWallet ew = new ElectronicWallet("bitcoin", 1000);
        ew.depositTransfer(90080.96);
        ew.withdrawMoney(34000);
        ew.checkBalance();
    }
}
