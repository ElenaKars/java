//Распечатайте первые 7 чисел от 1 до 100, которые делятся на 5 без остатка.
//Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.

package homework_08;

public class Task_3 {
    public static void main(String[] args) {
        int num = 1;
        int j = 0;

        while (num <= 100 && j < 7) {
            if (num % 5 == 0) {
                System.out.println(num);
                num += 5;
                j++;
            } else {
                num++;
            }
        }
    }
}
