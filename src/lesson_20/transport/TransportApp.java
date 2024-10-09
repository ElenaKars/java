package lesson_20.transport;

public class TransportApp {
    public static void main(String[] args) {
        Bus bus = new Bus("Bus-X1", 2020, 10);

        System.out.println(bus.toString());

        bus.start();

        bus.stop();

        System.out.println("\n================");

        Train train = new Train("Skoda", 2022, 40, 4);
        System.out.println(train.toString());

        train.start();
        System.out.println(train.getModel());

        System.out.println("capacity: " + train.getCapacity());
        train.setCountCouches(3);
        System.out.println("capacity: " + train.getCapacity());

        System.out.println("\n============");

        Bus bus1 = new Bus("bus x2", 2024, 3);
        System.out.println(bus1.takePassenger());
        System.out.println(bus1.takePassenger());
        System.out.println(bus1.takePassenger());
        System.out.println(bus1.takePassenger());

        System.out.println(bus1.dropPassengers());
        System.out.println(bus1.dropPassengers());

        System.out.println("Количество пассажиров " + bus1.getCountPassengers());


    }
}
