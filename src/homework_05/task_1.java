package homework_05;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Ваше имя: ");

        String name = scanner.nextLine();
        System.out.println(name.length());

        char chFirst = name.charAt(0);
        char chLast = name.charAt(name.length() - 1);

        System.out.println(chFirst + "|" + (int)chFirst);
        System.out.println(chLast + "|" + (int)chLast);


    }
}
