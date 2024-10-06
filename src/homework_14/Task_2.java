//Task 2
//Сумма четных чисел
//Напишите метод, который вычисляет сумму всех четных чисел в массиве.
package homework_14;

public class Task_2 {
    public static void main(String[] args) {

        int [] arr = {2, 5, 8};
        System.out.println(toGetSumEvenNum(arr));
    }
    public static int toGetSumEvenNum (int [] arr){
        int sumEvenNum = 0;
        if(arr.length == 0){
            System.out.println("The empty array");
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                sumEvenNum += arr[i];
            }
        }
        return sumEvenNum;
    }
}
