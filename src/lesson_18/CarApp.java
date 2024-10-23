package lesson_18;

public class CarApp {
    public static void main(String[] args) {

        System.out.println("Sattic before objects cars creating: ");
        System.out.println(Car.totalCarProduced);
        Car car = new Car ("BMW", 200);
        System.out.println(car.toString());

        Car car2 = new Car("VW", 300);
        System.out.println(car2.toString());
        System.out.println(car.toString());

        System.out.println("static var: " + Car.totalCarProduced);
        //я могу обратиться к статике, используя конкретный объект car2.totalCarProduced
        //но это плохая практика. Обращаться нужно к статике от имени класса

        //могу вызвать статический метод без создания объекта (экземпляра) класса
        Car.testStatic();

        //использование статических методов "утилитных" классов
        int sum = MathUtils.sumOfInts(25, 10);
        System.out.println("sum: " + sum);

    }
}
