package lesson_26;

public class BoxesApp {
    public static void main(String[] args) {
        String var = "hello";
        System.out.printf("Шаблон строки %s\n", var);

        SuperBoxGen<String> box = new SuperBoxGen<>("Hello");

        SuperBoxGen<Double> doubleBox = new SuperBoxGen<>(3.14);

        SuperBoxGen boxObject = new SuperBoxGen<>("String");
        boxObject.setValue(1);

        System.out.println((doubleBox.getValue() + 5.0));
    }
}
