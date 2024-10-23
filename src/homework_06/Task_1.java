//Task 1
//Дан текст Programming is fun.
//
//Напишите программу, которая проверяет, содержит ли эта строка слово “fun”, и выведите результат в виде булевой переменной.
package homework_06;

public class Task_1 {
    public static void main(String[] args) {
        String str = "Programming is fun";
        boolean fun = str.contains("fun");

        System.out.println(fun);
    }
}
