package homework_23.task_1;

abstract class Shape {
    protected String type;

    public Shape() {
        this.type = "Shape";
    }

    public abstract double area();
    public abstract double perimeter();

    public String toString() {
        return type + " area: " + area() + ", perimeter " + perimeter();
    }
}
