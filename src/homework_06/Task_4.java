package homework_06;

public class Task_4 {

        public static void main(String[] args) {

            int a = 8;
            int b = 3;
            boolean result;

            result = (a + b) > 10;
            System.out.println("Result 1: " + result);

            // 11>10 true
            result = (a - b) == 5;
            System.out.println("Result 2: " + result);
            // 5 == 5 true
            result = (a * b) != 24;
            System.out.println("Result 3: " + result);
            // 24 == 24 false
            result = (a / b) >= 2;
            System.out.println("Result 4: " + result);
            // точно больше 2, по условию больше или равно --> true

            result = !(a % b == 2);
            System.out.println("Result 5: " + result);
            // остаток деления равен 2 --> true. Знак восклицания означает отрицание выражения --> false
        }

}
