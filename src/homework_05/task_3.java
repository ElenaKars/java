package homework_05;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку чётной длины");
        String word = scanner.nextLine();

        int middle = word.length() / 2;

        char firstMiddle = word.charAt(middle - 1);
        char secondMiddle = word.charAt(middle);
        System.out.println("Средние буквы: " + firstMiddle + secondMiddle);

        String subStr = word.substring((middle - 1), (middle +1));
        System.out.println("Средние буквы substr: " + subStr);
    }
}
