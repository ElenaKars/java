package homework_20.task_1;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n=======rectangle==========");

        Rectangle rectangle = new Rectangle();
        rectangle.setName("Rectangular");
        rectangle.displayInfo();
        rectangle.setColor("green");
        rectangle.setDimensions(4.5, 3.8);

        rectangle.calculateArea();

        System.out.println("\n=======circle==========");

        Circle circle = new Circle();
        circle.setName("Circle");
        circle.setColor("red");
        circle.displayInfo();

        circle.setRadius(4);

        circle.calculateArea();
    }
}
