//Task 1
//Написать метод, который считает сумму всех элементов в массиве.
package homework_11;

import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        int[] numbers = {9,0, 8, 0};
        int sum = getSum(numbers);
        System.out.println("Сумма пустого массива: " + getSum(numbers));

        int[] emptyArray = {};
        System.out.println("Сумма пустого массива: " + getSum(emptyArray));

        int[] nullArr = null;
        System.out.println("Сумма null массива: " + getSum(nullArr));
    }

    private static int getSum(int[] numbers) {
        if (numbers == null){
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;

    }
}
