package homework_20.task_1;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n=======rectangle==========");

        Rectangle rectangle = new Rectangle("Rectangle", "red", 3.0, 4);

        rectangle.displayInfo();

        rectangle.setDimensions(4.5, 3.8);

        rectangle.calculateArea();

        System.out.println("\n=======circle==========");

        Circle circle = new Circle("Circle", "nhjhj");

        circle.displayInfo();

        circle.setRadius(4);

        circle.calculateArea();
    }
}
