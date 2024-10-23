package homework_28.task_1;

public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(3.0, 2.3);
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle(5.6, 7.8);

        System.out.println(rec);
        System.out.println(rec1);
        System.out.println(rec2);

        rec.setLength(9.9);
        rec.setWidth(2.5);
        System.out.println(rec);

        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(5.0, 3.0);
        Rectangle rect3 = new Rectangle(4.0, 2.0);

        System.out.println(rect1.equals(rect2)); // Должно быть true
        System.out.println(rect1.equals(rect3));
    }
}
