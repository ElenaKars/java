//Класс Circle (Круг)
//
//• Создайте класс Circle, который наследуется от Shape.
// • Добавьте поле radius типа double, которое хранит радиус круга.
// • Создайте метод setRadius(double radius), который устанавливает значение поля radius.
// • Создайте метод calculateArea(), который вычисляет и выводит площадь круга.
//

package homework_20.task_1;

public class Circle extends Shape {

    private double radius;

//    public Circle(String name, String color) {
//        super(name, color);
//        this.setColor("red");
//    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void calculateArea(){

        if (radius > 0){
            double area = Math.PI * Math.pow(radius, 2);

            System.out.println("Площадь круга: " + area);
        } else {
            System.out.println("Радиус не может быть меньше или равен 0");
        }
    }
}
