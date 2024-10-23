package homework_04;

public class task_4 {
    public static void main(String[] args) {
        char ch1 = 'e';
        char ch2 = 'l';
        char ch3 = 'e';
        char ch4 = 'n';
        char ch5 = 'a';

        ch1 = (char) (ch1 - 32);
        ch2 -= 32;
        ch3 -= 32;
        ch4 -= 32;
        ch5 -= 32;

        System.out.println("My name: " + ch1 + ch2 + ch3 + ch4 + ch5);
    }
}
