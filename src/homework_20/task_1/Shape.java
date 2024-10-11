//Task 1
//Иерархия классов “Фигуры”
//Создайте программу, которая демонстрирует наследование с использованием классов геометрических фигур.
//
//Базовый класс Shape
//
//• Создайте класс Shape. • Добавьте поле name типа String, которое хранит название фигуры. • Создайте метод displayInfo(), который выводит на экран значение поля name.
//

//Класс Main
//
//• В методе main создайте объекты классов Rectangle и Circle. • Установите значения для их полей с помощью соответствующих методов. • Установите имя фигуры, используя поле name, унаследованное от класса Shape. • Вызовите метод displayInfo() и методы вычисления площади для каждого объекта, чтобы вывести информацию о фигуре и её площади.
//
//Дополнительное задание (по желанию):
//
//•	Добавьте в класс Shape поле color типа String и метод setColor(String color).
//•	Установите цвет для каждой фигуры и выведите эту информацию в методе displayInfo().
//Copy
//Пример реализации (без кода):
//•	Создаете базовый класс Shape с полем name и методом displayInfo().
//•	Создаете класс Rectangle, который наследуется от Shape, с дополнительными полями и методами.
//•	Аналогично создаете класс Circle.
//•	В методе main работаете с объектами Rectangle и Circle, используя унаследованные и собственные методы этих классов.

package homework_20.task_1;

public class Shape {
    private String name;
    private String color;

//    public Shape(String name, String color) {
//        this.name = name;
//        this.color = color;
//    }

    public void displayInfo(){
        System.out.println("Hазвание фигуры: " + name);
        System.out.println("Цвет фигуры: " + color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

}
