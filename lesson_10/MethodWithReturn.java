package lesson_10;

import java.util.Random;

public class MethodWithReturn {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int sum = sum (a, b);
        System.out.println(sum);
        System.out.println(squareNumber(2.5));
        System.out.println(concatStr("Java", 17));
        int [] arr = fillArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int sum (int x, int y){
        int result = x + y;
        return result;
    }

    public static double squareNumber (double number){
        return number * number;
    }
    public static String concatStr (String str, int x) {
        String result = str + x + "!!!";
        return result;
    }
    public static int[] fillArray (){
        int[] result = new int[10];

        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(101);
        }
        return result;
    }
}
