//Task 1
//Найдите произведение всех чисел от 1 до 15 включительно.
//
//Результат выведите на экран
package homework_08;

public class Task_01 {
    public static void main(String[] args) {
        int i = 1;
        long res = 1;

        while (i <= 15){
            res *= i;
            i++;

        }
        System.out.println(res);
    }
}
