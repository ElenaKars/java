package lesson_12;

import java.util.Arrays;
import java.util.Random;

public class Arrays_main {
    public static void main(String[] args) {
        int [] ints = {34, 78, 65, 89, 88, 1, 45};
        System.out.println(ints.length);

        int ind = ArraysUtil.linearSearch(ints, 100);

        System.out.println(ind);

        System.out.println("Массив до сортировки: ");
        System.out.println(Arrays.toString(ints));

        ArraysUtil.sortSelection(ints);

        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(ints));

        // [0, 3, 10, 21, 34, 38, 41, 57, 67, 77, 80, 87, 99]
        int number = 87;
        int idx = ArraysUtil.binarySearch(ints, number);
        System.out.println("Индекс числа в массиве: " + idx);

        int[] testArray = new int[1_000_000];
        Random random = new Random();
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = random.nextInt(10_001); // 0..10000
        }

        System.out.println("\n ================== \n");

        // ArraysUtils.sortSelection(testArray);
        Arrays.sort(testArray); // сортировка. Разберем позже

        number = 5000;
        idx = ArraysUtil.binarySearch(testArray, number);
        System.out.println("Индекс числа в тестовом массиве (бинарный поиск): " + idx);

        idx = ArraysUtil.linearSearch(testArray, number);
        System.out.println("Индекс числа в тестовом массиве (линейный поиск): " + idx);
    }
}
