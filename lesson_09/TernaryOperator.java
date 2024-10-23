package lesson_09;

public class TernaryOperator {
    public static void main(String[] args) {
        int x = 15;
        String result;

        if (x >= 0) {
            result = "положительное";
        } else {
            result = "отрицательное";
        }

        String res1 = (x >= 0) ? "положительное" : "отрицательное";
        System.out.println("Число " + res1);
    }
}
