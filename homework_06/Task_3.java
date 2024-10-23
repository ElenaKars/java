//Task 3
//Попросите пользователя ввести целое число с клавиатуры.
//Ваша программа должна вывести строку в формате:
//Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
//Число: 3 четное: false; кратно 3: true; четное и кратное 3: false

package homework_06;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int input = scanner.nextInt();
        scanner.nextLine();
        boolean isEven = input % 2 == 0;
        boolean multipleOfThree = input % 3 == 0;
        boolean evenAndMultipleOfThree = isEven && multipleOfThree;

        System.out.println("Число: " + input + " четное: " + isEven + "; кратно 3: " + multipleOfThree + "; четное и кратное 3: " + evenAndMultipleOfThree);
    }
}
