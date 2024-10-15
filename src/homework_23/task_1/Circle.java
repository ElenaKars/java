package homework_23.task_1;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.type = "Circle";
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

}
