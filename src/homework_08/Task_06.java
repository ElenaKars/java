//Task 6
//Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.
//
//Вывести на экран:
//
//Минимальное значение в массиве
//Максимальное значение в массиве
//Среднее арифметическое всех значений в массиве
package homework_08;

import java.util.Random;

public class Task_06 {
    public static void main(String[] args) {

        Random random = new Random();
        int arrayLength = 5 + random.nextInt(11);
        int[] array = new int[arrayLength];
        int i = 0;

        System.out.println("Длина массива: " + arrayLength);
        System.out.print("[");

        while (i < array.length){
            array[i] = random.nextInt(101) - 50;
            System.out.print(array[i] + ((i != array.length - 1) ? ", " : "]\n"));
            i++;
        }
        int min = array[0];
        int max = array[0];
        int sum = 0;
        i = 0;

        while (i < array.length) {
            sum += array[i];

            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max){
                max = array[i];
            }
            i++;
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("average: " + sum / (double) arrayLength);
    }
}
