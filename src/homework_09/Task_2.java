//Task 2
//Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени этоЧисло
//
//Например: Если в метод пришло число 3 - метод должен вывести число 8 (так как 2 в степени 3 = 8)
//
//класс Math для нахождения степени числа использовать нельзя ;)
package homework_09;

public class Task_2 {
    public static void main(String[] args) {
    exponentOfTwo(-3);
    }
    public static void exponentOfTwo (int exponent) {
//        boolean isPositive = exponent >= 0;
//        exponent = (isPositive) ? exponent : exponent * (-1);
        if (exponent >= 0) {
            int result  = 1;
            for (int i = 0; i < exponent; i++) {
                result *= 2;
            }
            System.out.printf("2 ^ %d\n", exponent,result);
        } else {
            exponent = exponent * (-1);
            int result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= 2;
            }
            double doubleResult = 1 / (double) result;
            System.out.printf("2 ^ -%d = 1/%d =  %4f\n", exponent, result, doubleResult);
        }
//        boolean isPositive = exponent >= 0;
//        int result = 1;
//
//        if (!isPositive){
//            exponent *= (-1);
//        }
//        if(isPositive){
//            System.out.printf("2 ^ %d = %d\n", exponent, result);
//        } else {
//            System.out.printf("2 ^ -%d = 1/%d =  %4f\n", exponent,result, 1 / (double)result);
//        }
//
//        for (int i = 0; i < exponent; i++) {
//            result *= 2;
//        }
//        System.out.println("2 в степени " + exponent + " = " + result);
    }
}
