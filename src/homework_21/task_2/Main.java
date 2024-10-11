//Task 2
//Компьютер и компоненты
//Создайте базовый класс Component с полями brand (бренд) и model (модель).
//Создайте производные классы: Processor, Memory, Storage от класса Component.
//Создайте класс Computer который будет содержать компоненты: процессор, память и накопитель.
//Реализуйте отношения между Computer и компонентами. Компоненты Processor и Memory не могу существовать без компьютера.


package homework_21.task_2;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("intel ", " 1234");
        Memory memory = new Memory("Toshiba ", " 12309");
        Storage storage = new Storage("Apple ", " 1 TB");

        Computer computer = new Computer(processor, memory, storage);
        computer.displayInfo();
    }
}
