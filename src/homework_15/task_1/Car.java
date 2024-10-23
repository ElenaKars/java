package homework_15.task_1;

public class Car {
        String brand;
        String model;
        int year;
        double engine;

        public Car(String brand, String model, int year, double engine) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.engine = engine;
        }

        public void showTheInfo() {
            System.out.println("Машина: " + brand + " " + model + " (" + year + "), Двигатель: " + engine + "L");
        }
    }

