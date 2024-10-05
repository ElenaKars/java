package lesson_05;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Ваше имя: ");
        String name = scanner.nextLine();
        //System.out.println("Продолжение программы");

        System.out.println(name);

        System.out.println("Введите ваш возраст");
        int age = scanner.nextInt();
        scanner.nextLine();// скушать остаток строки
        System.out.println(age);

        System.out.println("Введите ваш рост");
        double height = scanner.nextDouble();//ввод через запятую
        scanner.nextLine();
        System.out.println(height);

    }
}
