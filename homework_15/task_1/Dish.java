package homework_15.task_1;

public class Dish {
    String material;
    String typeOfDish;
    double diameter;
    double volume;
    boolean isMicrowaveSafe;

    public Dish(String material, String typeOfDish, double diameter, double volume, boolean isMicrowaveSafe) {
        this.material = material;
        this.typeOfDish = typeOfDish;
        this.diameter = diameter;
        this.volume = volume;
        this.isMicrowaveSafe = isMicrowaveSafe;

    }
    public void showTheInfo() {
        System.out.println("Посудa: " + typeOfDish + ", Материал: " + material + ", Диаметр: " + diameter + " см, Объем: " + volume + " л, Можно в микроволновку: " + isMicrowaveSafe);
    }
}
