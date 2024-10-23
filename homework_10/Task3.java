//Task 3
//Написать метод, принимающий
// на вход массив целых чисел. Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве
//
//вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
package homework_10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {0, 13, -25, 11, 31, 55, 98, 11, 5};
//        int[] primeArray = getArrayWithOnlyPrime(numbers);
        System.out.println(Arrays.toString(numbers));
        isPrime(100003);
isPrime2(100003);
    }

    public static int[] getArrayWithOnlyPrime(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                count++;
            }
        }
        if (count == 0) return new int[0];
        int[] res = new int[count];
        for (int i = 0, indPrime = 0; i < numbers.length && indPrime < count; i++) {
            if (isPrime(numbers[i])) {
                res[indPrime++] = numbers[i];
            }
        }
        return res;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        int count = 0;
        for (int i = 2; i < number; i++) {
            count++;

            if (number % i == 0) return false;
        }
        System.out.println("Prime1 Проверено дклителей: " + count);
        return true;
    }
    public static boolean isPrime2 (int number) {
        if(number <= 1) return false;
        if(number == 2 || number == 3) return true;

        if(number % 2 == 0 || number % 3 == 0) return false;

        int count = 0;

        for (int i = 5; i*i <= number; i = i + 6) {
            count++;
            if(number % i == 0 || number % (i +2) == 0) {
                return false;
            }
        }
        System.out.println("Проверено дклителей: " + count);

        return true;
    }

}