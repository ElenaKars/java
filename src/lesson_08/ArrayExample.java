package lesson_08;

import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arrays;
        String[] strings;
        int array1[];//не рекоменд

        arrays = new int[4];//создали массив типа int c 4 ячейками
        strings = new String[10];

        int[] array2 = new int[8];
        //для всех числовых типов (в том числе char  это будет 0 (0.0)
        //для boolean - false
        //для всех ссылочнчх типов данных - null

        boolean[] booleans = new boolean[3];

        int value = arrays[0];
        System.out.println("value: " + value);
        System.out.println("arrays: " + arrays); //получим ссылку на алрес в ячейке памяти

        int[] numbers = new int[] {45, 56, -16, 0, 150};
        int[] ints = {-10, 32, 34,7789,987};

        int val = numbers[0];
        System.out.println("val: " + val);
        System.out.println("numbers[4]: " + numbers[4]);

        numbers[2] = 100;

        System.out.println("Вывксти все значения массива");
        int j = 0;

        while(j < numbers.length){
            System.out.print(numbers[j] + "; ");
            j++;
        }
        System.out.println();

        Random random = new Random();
        int[] nums = new int[10];
        int k = 0;
        while (k < nums.length) {
            nums[k] = random.nextInt(100);
            System.out.println(nums[k] + " , ");
            k++;
        }
        System.out.println();

        System.out.println(nums);
        int min = nums[0];
        int i = 0;
        while (i < nums.length){
            if (nums[i] < min){
                min = nums[i];
            }
            i++;
        }

    }
}
