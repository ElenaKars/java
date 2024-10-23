//Task 2
//Компьютер и компоненты
//Создайте базовый класс Component с полями brand (бренд) и model (модель).
//Создайте производные классы: Processor, Memory, Storage от класса Component.
//Создайте класс Computer который будет содержать компоненты: процессор, память и накопитель.
//Реализуйте отношения между Computer и компонентами. Компоненты Processor и Memory не могу существовать без компьютера.


package homework_21.task_2;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage("Apple ", " 1 TB");

        Computer computer = new Computer(storage);
        computer.displayInfo();

        Computer computer1 = new Computer(new Storage("Samsung", "1TB"));
        computer1.storage = new Storage("DDp", "67543");  // Прямое изменение поля
        System.out.println(computer1.storage.getBrand());

        System.out.println(computer1.getStorage().toString());
    }
}
