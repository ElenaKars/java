//Task 4 * (Опционально)
//Написать метод, который удаляет все вхождения
// заданного числа
// из массива и возвращает новый массив без этого числа.
package homework_11;

import java.util.Arrays;

public class Task_4 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 9};
        int[] res = removeEl(arr, 2);
        System.out.println(Arrays.toString(res));
    }


public static int [] removeEl(int[] arr, int elem) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] == elem) count++;
    }
    //if(count == 0) return arr;
    int [] res = new int[arr.length - count];
    for (int i = 0, ind = 0; i < arr.length ; i++) {
        if(arr[i] != elem) {
    res[ind] = arr[i];
    ind++;
        }
    }
        return res;
}
}