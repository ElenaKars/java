// Task 1
//Класс "Калькулятор"
//Создайте класс Calculator, который будет предоставлять
//
//базовые арифметические операции: сложение, вычитание, умножение и деление
//Класс должен содержать:
//
//Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.
package homework_18.task_1;

public class Calculator {

    public static int add(int a, int b){
        return a + b;
    }

    public static int multiple(int a, int b){
        return a * b;
    }

    public static int subtraction (int a, int b){
        return a - b;
    }

    public static int divide(int a, int b){

        if (b == 0){
            System.out.println("error, division by zero");
            return 0;
        }
        return a / b;
    }
}
