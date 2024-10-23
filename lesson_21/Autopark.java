package lesson_21;

public class Autopark {

    public static void main(String[] args) {
        BusDriver busDriver = new BusDriver("Nick", "KJ-78654325");
        BusDriver busDriver1 = new BusDriver("Svenja", "OI-975325");
        Autobus bus = new Autobus(busDriver, 15);
        Autobus bus1 = new Autobus(busDriver1, 24);

        System.out.println("bus: " + bus.toString());
        System.out.println("bus1: " + bus1.toString());

        BusDriver busDriver3 = new BusDriver("Peter", "OI-975325");
        bus1.setDriver(busDriver3);
        System.out.println("bus1: " + bus1.toString());

        bus.installNewAutopilot("YT-97335");
        System.out.println(bus.toString());

        System.out.println("\n==============");
        System.out.println("Количество пассажиров " + bus.getCountPassenger());
        bus.showListOfPassengers();

        Passenger passenger = new Passenger("Fred");
        Passenger passenger1 = new Passenger("Klava");

        bus.takePassenger(passenger);
        bus.showListOfPassengers();
        System.out.println("===============");
        bus.takePassenger(passenger1);
        bus.showListOfPassengers();
        System.out.println("===============");
        bus.takePassenger(passenger1);
        bus.showListOfPassengers();
    }

}
