//Task 1
//Необходимо написать программу,
//которая предлагает пользователю ввести число
// на выбор: 1, 2 или 3.
//
//Программа должна сказать,
//какое число ввёл пользователь:
// Один, Два, или Три (текстом)
package homework_07;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число 1, 2 или 3");
        int input = scanner.nextInt();
        scanner.nextLine();

//        if (input == 1) {
//            System.out.println("Один");
//        } else if (input == 2) {
//            System.out.println("Два");
//        } else if (input == 3) {
//            System.out.println("Три");
//        } else {
//            System.out.println("Вы ввели некорректное число");
//        };
        switch (input){
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            case 3:
                System.out.println("Три");
                break;
            default:
                System.out.println("Вы ввели некорректное число");
        }
        //Java 14
//        switch (input){
//            case 1 -> System.out.println("Один");
//            case 2 -> System.out.println("Два");
//            case 3 -> System.out.println("Три");
//            default -> System.out.println("Вы ввели некорректное число");
//        }

//        String res = switch (input) {
//            case 1 -> "Один";
//            case 2 -> "Два";
//            case 3, 4 -> "Три / четыре";
//            default -> "Вы ввели некорректное число";
//        };
//        System.out.println(res);
    }
}
