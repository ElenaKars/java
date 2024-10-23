//Task 2
//Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).
package homework_11;

public class Task_2 {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6};
        //double averageArr = getAverage(numbers);
        System.out.println("среднее значение элементов в массиве " + getAverage(numbers));
        int[] emptyArr = {};
        System.out.println("Среднее значение элементов в пустом массиве: " + getAverage(emptyArr));

    }

    private static double getAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("Ошибка: массив пустой или null.");
            return 0.0;
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }
}
