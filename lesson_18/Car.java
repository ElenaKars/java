package lesson_18;

public class Car {
    public static int totalCarProduced;

    private String model;
    private int powerPS;

    public Car(String model, int powerPS) {
        this.model = model;
        this.powerPS = powerPS;
        totalCarProduced++;
    }

    public  String toString () {
        return String.format("Auto-model: %s, power: %d." + "Всего выпущено машин: %d", model, powerPS, totalCarProduced);
    }

    public static void testStatic(){
        //в статике нельзя использовать this
        System.out.println("Hello from static method");
    }
}
