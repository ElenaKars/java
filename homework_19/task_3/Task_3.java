package homework_19.task_3;

public class Task_3 {
    public static void printMessage(final String message) {

        System.out.println("Message: " + message);
//        message = "hello"; при повторном опредении переменной возникает ошибка: java: final parameter message may not be assigned
    }

    public static void main(String[] args) {
        printMessage("hello world");

    }
}
//