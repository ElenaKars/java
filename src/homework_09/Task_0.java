package homework_09;

public class Task_0 {
    public static void main(String[] args) {
        countChar ("Hello");
    }

    public static void countChar (String text){
        int length = text.length();
        System.out.println("Количество символов в слове: " + length);
    }

}
