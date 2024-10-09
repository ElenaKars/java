//Класс Rectangle (Прямоугольник)
//
//• Создайте класс Rectangle, который наследуется от Shape.
// • Добавьте поля width и height типа double, которые хранят размеры прямоугольника.
// • Создайте метод setDimensions(double width, double height), который устанавливает значения полей width и height.
// • Создайте метод calculateArea(), который вычисляет и выводит площадь прямоугольника.
//

package homework_20.task_1;

import homework_20.Shape;

public class Rectangle extends Shape {
    private double width;
    private double height;


        public Rectangle(String name, String color, double width, double height) {
        super(name, color);
        this.width = width;
        this.height = height;
        this.setColor("green");
    }

    public void setDimensions(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void calculateArea(){
        double area = height * width;
        System.out.println("Площадь прямоугольника: " + area);
    }
}
