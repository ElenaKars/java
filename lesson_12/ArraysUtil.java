package lesson_12;

public class ArraysUtil {

    // линейный поиск O (n)в массивеб перебор всех элементов и сравнивается с искомым значением
    public static int linearSearch (int [] arr, int searchValue) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            counter++;
            if(arr[i] == searchValue){
                System.out.println("Линейный поиск нашел за: " + counter + " шагов");
                return i;
            }
        }
        return -1;
    }

    // Метод ищет минимальное значение по всему массиву и возвращает индекс min значения
public static int minInd(int[] array) {
        int min = array[0];
        int minInd = 0;
    for (int i = 0; i < array.length; i++) {
        if(array[i] < min){
            min = array[i];
            minInd = 1;
        }
    }
    return minInd;
}

    // Метод ищет минимальное значение в части массива от стартового индекса и до конца массива
    // возвращает индекс min значения

    public static int minInd(int[]array, int startInd) {
        int min = array[startInd];
        int minInd = startInd;
        for (int i = startInd; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
                minInd = i;
            }
        }
        return minInd;
    }
// Сортировка выбором
    /*
    Описания алгоритма сортировки:
    Выбирается минимальный элемент массива
    минимальное значение меняется местами с первым элементом
    Вторая итерация - выбирается мин элемент из оставшейся части массива
    меняется местами с первым из оставшихся.

     */

    public static void sortSelection (int[] array){
        for (int i = 0; i < array.length; i++){
            int localMin = minInd(array, i);

            int temp = array[i];

            array[i] = array[localMin];
            array[localMin] = temp;
        }
    }
    public static int[] copyOfArray( int[] arr){
        int[] newArr = new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    // Бинарный поиск значения в массиве
    // [0, 3, 10, 21, 34, 38, 41, 57, 67, 77, 80, 87, 99]
    public static int binarySearch(int[] array, int searchValue) {
        int startIndex = 0; // 0
        int endIndex = array.length - 1; //12
        int middleIndex;

        int counter = 0;

        // Проверка, что часть массива можно разделить пополам
        while (startIndex <= endIndex) { // 1. 0 <= 12

            counter++;

            // вычислить средний индекс
            middleIndex = startIndex + (endIndex - startIndex) / 2;

            // Сравниваем значение в середине части массива с искомым
            if (array[middleIndex] == searchValue) {
                System.out.println("Найдено за " + counter + " шагов");
                return middleIndex;
            }

            // Если значения не равны - определяем какую половину массива мы отбросим

            if (array[middleIndex] > searchValue) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }

        // Если цикл while закончен (не осталось частей массива, которые можно поделить пополам)
        // значит искомое значение в массиве отсутствует

        System.out.println("Значение не найдено! Шагов сделано: " + counter);
        return -1;
    }

}
