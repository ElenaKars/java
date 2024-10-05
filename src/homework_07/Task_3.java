//Task 3 (Повышенной сложности, опционально)
//Программа предлагает пользователю ввести четырехзначное число.
//Ввод осуществляется только в формате строки (String).
//Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
//Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
//Примеры:
//
//Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
//Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.

package homework_07;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Введите четырехзначное число");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if (str.length() != 4){
            System.out.println("Некорректное число. Введите повторно четырезначное число");
            return;
        }
            if(str.charAt(0) < 48|| str.charAt(0) > 57){
                System.out.println("Символ не число");
            }
//            if ((str.charAt(0)+str.charAt(1)) == (str.charAt(2) + str.charAt(3))){
//                System.out.println("Счастливое число");
//            } else {
//                System.out.println("Билет несчастливый");
//            }

        //option2
        if (str.length() == 4) {

            int digit1 = Character.getNumericValue(str.charAt(0));
            int digit2 = Character.getNumericValue(str.charAt(1));
            int digit3 = Character.getNumericValue(str.charAt(2));
            int digit4 = Character.getNumericValue(str.charAt(3));

            int sum1 = digit1 + digit2;
            int sum2 = digit3 + digit4;

            if (sum1 == sum2){
                System.out.println("Счастливый билет!");
            } else {
                System.out.println("Билет несчастливый.");
            }

            System.out.printf("Числа %d, %d, %d, %d\n", digit1, digit2, digit3,digit4);

        } else {
            System.out.println("Некорректное число. Введите повторно четырезначное число");
        }
    }
}
