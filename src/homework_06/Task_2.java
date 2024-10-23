//Task 2
//Создайте две переменные типа int.
//
//В первую переменную запишите случайное значение от 0 до 50.
//Во вторую переменную случайное значение от 0 до 100.
//(опционально) Во вторую переменную случайное значение от -20 до 30.
//Проверьте:
//
//равны ли переменные,
//
//не равны ли они,
//
//больше ли a, чем b,
//
//и меньше ли b, чем a.
//
//Выведите результат на экран.
package homework_06;

import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        int a = 23;
        Random random = new Random();
        int min = -20;
        int max = 30;
        int b = random.nextInt(max - min + 1) + min;

        System.out.println(b);

        boolean res = a == b;

        System.out.println("Переменные a == b: " + res);

        boolean res1 = a > b;

        System.out.println("a > b: " + res1);
    }
}
