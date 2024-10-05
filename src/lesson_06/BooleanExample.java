package lesson_06;

import java.util.Random;

public class BooleanExample {
    public static void main(String[] args) {
        boolean bol1 = true;
        bol1 = false;

        int x = 10;
        int y = 5;

        boolean b1 = x == y;
        System.out.println(b1);

        String str = "Java is the best";

        boolean contains = str.contains("Java");
        System.out.println("str.contains(\"Java\"):" + contains);

        //Лоническое отрицание
        boolean b2;
        b2 = !false;

        System.out.println("!false: " + b2);

        //Лоническое и &
        // true & true --> true
        //true & false --> false

        //Лоническое и |

        //Генерация случайного числа

        Random random = new Random();
        int rand = random.nextInt(100); //от 0 до 99 включительно
        System.out.println(rand);
        boolean isEven = rand % 2 == 0;
        System.out.println(isEven);
        boolean matchNum = (rand % 2 == 0) | (rand % 5 == 0);
        System.out.println("matchNum: " + matchNum);

        //Логическое исклбчающее XOR "^"
        //Логическое сокращенное &&

        boolean b6 = true && false;
        System.out.println("true && false: " + b6);
        b6 = true && true;
        System.out.println("true && true: " + b6);

        int a = 10;
        int b = 0;
        boolean b7 = (b != 0) && (a / b > 2);

        System.out.println("a / b > 2: " + b7);

        //Логическое ||







    }

}
