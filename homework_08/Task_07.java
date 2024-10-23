//Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.
//
//Пример:
//
//{ 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }
package homework_08;

public class Task_07 {
    public static void main(String[] args) {
        int [] array = {5, 6, -25, 0, 31, -15};

        int minIndex = 0;
        int min = array[minIndex];

        int maxIndex = 0;
        int max = array[maxIndex];

        int i = 0;
        while (i < array.length){
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            if (array[i] > max){
                max = array[i];
                maxIndex = i;
            }
            i++;
       }
        System.out.println("min: " + min);
        System.out.println("max: " + max);

        int temp = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = temp;

        i = 0;
        while (i < array.length){
            System.out.println(array[i++] + ", ");
        }
    }

}
