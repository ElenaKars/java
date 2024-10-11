package lesson_22;

public class Calculator {
//статический полимозфизм
    public static int add(int a, int b){
        return a + b;
    }

    public static double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        int sum = Calculator.add(15, 45);
    }
}
