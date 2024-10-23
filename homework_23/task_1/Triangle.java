package homework_23.task_1;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.type = "Triangle";
    }

    private boolean isValidSides(){
        return  sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }

    @Override
    public double area() {
        // sqrt ( p2 * (p2 - a) * (p2 - b) * (p2 - c))
        // Полупериметр
        double p2 = perimeter() / 2;

        double area = Math.sqrt(p2 * (p2 - sideA) * (p2 - sideB) * (p2 - sideC));
        return area;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}
