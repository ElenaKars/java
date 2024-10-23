package lesson_26.methods;

import lists.MyArrayList;

public class Util {
    // Метод, возвращающий строковое представление любого массива

    public static <T> String printArray(T[] array){
        if(array == null || array.length == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            sb.append((i < array.length - 1) ? ", " : "]");
        }
        return sb.toString();
    }
    //Поменять местами 2 элемента в любом массиве по их индексу

    public static <T> void swap(T[]arr, int ind1, int ind2){
        T temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
    // ограничение сверху Upper Bounds
    //написать метод, который считает сумму элементов в массиве

    public static <T extends Number> double sum (T[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            T element = array[i];
            sum += element.doubleValue();
        }
        return sum;
    }

    public static <T extends Number> int sum2 (T[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            T element = array[i];
            sum += element.intValue();
        }
        return sum;
    }

    public static double listSum (MyArrayList<? extends Number> listNumber) {
        double sum = 0;
        for (int i = 0; i < listNumber.size(); i++) {
            sum += listNumber.get(i).doubleValue();
        }
        return sum;
    }
}
