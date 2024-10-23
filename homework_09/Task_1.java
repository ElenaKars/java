//Task 1
//Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
//
//{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
//Copy
//Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:
//
//{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
//Copy
//Еще одна перегрузка: метод принимает массив и булевый флаг. Если флаг == true -> печатает массив в обратном порядке Если флаг == false -> печатает массив в прямом порядке
package homework_09;

import java.util.concurrent.LinkedBlockingDeque;

public class Task_1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println("Обратный порядок: ");
        toChangeArray(array1);
        System.out.println();
        System.out.println("Bывод части массива слева в прямом порядке, а справа в обратном начиная с индекса: ");
        toChangeArray(array1, 3);
        System.out.println();
        System.out.println("Обратный порядок c флагом true:");
        toChangeArray(array1, true);
        System.out.println();
        System.out.println("Обратный порядок c флагом false:");
        toChangeArray(array1, false);
    }
    public static void toChangeArray (int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void toChangeArray (int[] array,int ind) {
        if ( ind < 0 || ind >= array.length) {
            System.out.println("Неверный индекс");
            return;
        }
        for (int i = 0; i < ind; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = array.length - 1; i >= ind; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

        public static void toChangeArray (int [] array, boolean reverse) {
            if (reverse) {
                for (int i = array.length - 1; i >= 0; i--){
                    System.out.print(array[i] + " ");
                }
            } else {
                for (int i = 0; i < array.length; i++){
                    System.out.print(array[i] + " ");
                }
            }
        System.out.println();
    }
}
