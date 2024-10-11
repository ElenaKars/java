package lesson_21;

import lesson_20.transport.Bus;

import java.util.Arrays;

public class Autobus {

    //Для создания связи типа HAS-A мы определяем поле класса, которое будет хранить ссылку на объект другого класса

    private static int counter = 1;

    private final int id;

    private BusDriver driver;//агрегация, те мягкая связь
    private Autopilot autopilot; // композиция (жесткая неразрывная) связь

    private final int capacity;
    private int countPassenger;

    private final Passenger[] passengers;

    public Autobus(BusDriver busDriver, int capacity) {
        this.id = counter++;
        this.capacity = capacity;
        this.driver = busDriver;
        this.autopilot = new Autopilot("AP-v001");
        this.passengers = new Passenger[capacity];
    }

    public void showListOfPassengers(){
        if (countPassenger == 0){
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassenger; i++) {
            sb.append(passengers[i].toString());
            sb.append((i < countPassenger - 1) ? ", " : "]");
        }
        System.out.println(sb.toString());
    }

    public boolean takePassenger(Passenger passenger){
        if(passenger == null) return false;

        if (countPassenger < capacity){
            if (isPassengerInBus(passenger)){
                System.out.printf("Пассажир id %d уже в автобусе с id %d\n", passenger.getId(), this.id);
                return false;
            }
            passengers[countPassenger] = passenger;
            countPassenger++;
            System.out.printf("Пассажир id %d завершил посадку в автобус id %d\n", passenger.getId(), this.id);
            return true;
        }
        System.out.printf("В автобусе id %d нет места!\n", this.id);
        return false;
    }

    private boolean isPassengerInBus(Passenger passenger){
        for (int i = 0; i < countPassenger; i++) {
            if(passengers[i].getId() == passenger.getId()){
                return true;
            }
        }
        return false;
    }

    public void installNewAutopilot(String softwareVersion){
        this.autopilot = new Autopilot(softwareVersion);
    }
    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{id:").append(id);
        sb.append(", capacity: ").append(capacity);
        sb.append("; ").append(driver.toString());
        sb.append("; ").append(autopilot.toString());
        sb.append("}");

        return sb.toString();

//        return " {id: " + id + ", capacity: " + capacity +
//                "; " + driver.toString() + "; " + autopilot.toString() +
//                "}";
    }
}
