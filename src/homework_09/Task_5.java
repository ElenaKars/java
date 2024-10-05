//Task 5
//Написать метод, который принимает массив строк.
// Вывести на экран все символы самой длинной строки из массива.
package homework_09;

public class Task_5 {
    public static void main(String[] args) {
        String[] words = {"One", "Two", "Twenty" };
        printStr(words);
    }

    public static void printStr (String[] strArray) {
        String longerstStr = strArray[0];

        for ( int i = 0; i < strArray.length; i++) {
            String word = strArray[i];
            if (strArray[i].length() > longerstStr.length()) {
                longerstStr = strArray[i];
            }
        }
        System.out.println("Самая длинная строка: " + longerstStr);
        System.out.println("Её символы: ");
        for (int i = 0; i < longerstStr.length(); i++) {
            System.out.print(longerstStr.charAt(i) + " ");
        }
        System.out.println();
    }
}
