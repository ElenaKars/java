package lesson_19;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        //возвращает строковое значение массива

        int[] array = {3, 2, 5, 6};

        String arrayToString = Arrays.toString(array);
        System.out.println(arrayToString);
        System.out.println("\n=======сортировка массива========\n ");
//        Arrays.sort(array);
        Arrays.sort(array,1, 4);//the last index is not incl
        System.out.println("jk" + Arrays.toString(array));

        System.out.println("\n=======binary search========\n ");
        //binary search
        //the array sbould be sort out
        //if the value is not found return the negative num
        int index = Arrays.binarySearch(array, 10);
        System.out.println("index: " + index);

        System.out.println("\n=======сравнение массивов на равенство========\n ");

        int[] test = {3, 2, 7, 6};
        //мы не можем корректно сравнивать массивы по значению методом equals
        System.out.println("array.equals(test)" + array.equals(test));
    //для сравнения массивов по значению используем Array.equals. Порядок значений учитывается
        boolean isArraysEquals = Arrays.equals(array, test);
        System.out.println("array.equals(test)" + isArraysEquals);

        // Находит и возвращает индекс первого различия между массивами

        int mismatchIndex = Arrays.mismatch(array, test);
        System.out.println("Arrays.mismatch(array, test): " + mismatchIndex);

        System.out.println("\n=======Многомерные массивы========\n ");
        int[][] arrayD = new int[3][4];
        System.out.println(Arrays.toString(arrayD));//[[I@3498ed, [I@1a407d53, [I@3d8c7aca]
        System.out.println(Arrays.deepToString(arrayD));//[[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]] овзвращает строкое значение массива , включая вложенные массивы

        //сравнение многомеон массивов
        int[][] arrayС = new int[3][4];
        boolean isEquals = Arrays.deepEquals(arrayС, arrayD);
        arrayС[0][3] = 1;
        arrayС[2][2] = 5;
        System.out.println(Arrays.deepToString(arrayС));// [[0, 0, 0, 1], [0, 0, 0, 0], [0, 0, 5, 0]]
        System.out.println("Arrays.deepEquals(arrayС, arrayD): " + isEquals);

        System.out.println("\n=======copyOf========\n ");
        //создает новый массив заданной длиныю При этом копирует элементы из старого массива
        //кол-во копируемых элементов равно новой длине массива. Если длина нового массива больше старого,
        // оставшиеся ячейки заполняются значениями по умол в зависимости от типа данных

        int[] copyOfTest = Arrays.copyOf(test, 10);
        System.out.println(Arrays.toString(copyOfTest));
        System.out.println(Arrays.toString(Arrays.copyOf(test, 2)));


        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] rangeFromInts = Arrays.copyOfRange(ints, 3, 10);
        System.out.println("Arrays.copyOfRange(ints, 3, 10) " + Arrays.toString(rangeFromInts));

        //получить новый массив со значениями старого
        int[] copyOfInts = Arrays.copyOf(ints, ints.length);
        System.out.println("Arrays.copyOf(ints, ints.length): " + Arrays.toString(copyOfInts));
        copyOfTest = Arrays.copyOfRange(ints, 0, ints.length);
        System.out.println("Arrays.copyOf(ints, ints.length): " + Arrays.toString(copyOfTest));

        //  System.out.println("\n=======System.arraycopy========\n ");

        int[] target = new int[10];
        System.arraycopy(ints, 9, target, 3, 5);
        System.out.println(Arrays.toString(target));

        // заполнение массива указанным значением

        int[] arr = new int [5];
        Arrays.fill(arr, 10);
        Arrays.fill(arr, 2, 4, 1000);
    }
}
