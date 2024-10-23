package lesson_25;

public class SimpleApp {
    public static void main(String[] args) {
        SimpleBox box = new SimpleBox(10);

        System.out.println(box);

        SimpleBox box1 = new SimpleBox(20);
        int sum = (int)box.getValue() + (int)box1.getValue();

        System.out.println("sum: " + sum);

        SimpleBox[] boxes = new SimpleBox[3];

        boxes[0] = box;
        boxes[1] = box1;
        boxes[2] = new SimpleBox(30);

        int sum1 = 0;
        for (int i = 0; i < boxes.length; i++) {
            sum1 += (int) boxes[i].getValue();
        }
        System.out.println("sum1: " + sum1);

        //Generic работают только с объектами
        //Мы можем использовать только ссылочные типы двнных

        //GenericBox<int> box = new SimpleBox<>();
    }
}
