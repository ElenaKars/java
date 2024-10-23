//Task 1
//Написать метод со следующим функционалом:
//
//На вход метод принимает массив целых чисел и число - длину нового массива. Метод должен создать и распечатать массив заданной в параметрах длинны. В начало массива должны быть скопированы элементы из входящего массива:
//
//{0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
//Copy
//{0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}
//Copy
//Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода
package homework_10;

import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        int[] arr = createArr(4);
        printArr(arr);
        int[] newArr = copyArr(arr, 6);
        printArr(newArr);
    }

    public static int[] createArr (int x) {
        Random random = new Random();
        int[] arrNew = new int[x];
        for (int i = 0; i < arrNew.length; i++) {
            arrNew[i] = random.nextInt(x);
        }
        return arrNew;
    }

    public static int[] copyArr (int[] array, int newLength){
        int[] newArr = new int[newLength];

        for (int i = 0; i < newLength; i++) {
            if (i < array.length){
                newArr[i] = array[i];
            } else {
                newArr[i] = 0;
            }
            }
        return newArr;
        }

    public static void printArr (int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

}
