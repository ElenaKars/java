package homework_22.task_2;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car();
        vehicles[1] = new Bicycle();
        vehicles[2] = new Motorcycle();

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].startEngine();
        }
    }

}
