package lesson_08;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;

        int sum = 0;

        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("сумма чисел от 1 до 100: " + sum);

        int n = 1;
        int sum1 = 0;

        while (n <= 100) {
            sum += n;
            n++;
        }

        i = 1;

        while (i <= 21) {
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }

        //распечатать каждый символ в отдельной строке

        String str = "Hello!";

        i = 0;

        while (i <= str.length()-1) {
            char ch = str.charAt(i);
            System.out.println(ch);
            i++;
        }
    }
}
