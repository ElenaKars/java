//Task 1
//Создайте интерфейсы Swimmer и Runner с методами swim() и run() соответственно.
//Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.
//Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.

package homework_24.task1;

public class App {
    public static void main(String[] args) {
        Triathlete triathlete = new Triathlete("Alex");

        triathlete.run();
        triathlete.swim();
    }



}
