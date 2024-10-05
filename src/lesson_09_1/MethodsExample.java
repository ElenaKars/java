package lesson_09_1;

public class MethodsExample {
    public static void main(String[] args) {

        sayHello();

        String string = "Java";
//        System.out.println("Hello!");
//        System.out.println("Hello!");
//        System.out.println("Hello!");
//        System.out.println("Hello!");
        saySomething("java");

        char ch = 'A';
        printDecimalCodeChar(ch);
    } // method area

    public static void printDecimalCodeChar(char ch1) {
        System.out.println((int) ch1);
    }
    public static void saySomething (String text) {
        System.out.println(text);
    }
    public static void sayHello(){
        // тело метода
        System.out.println("Hello!");

    }
} //end class
