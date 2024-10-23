package lesson_20.transport;

public class Train extends Vehicle{

    private int capacity;
    private int countPassengers;
    private int countCouches;
    private final int couchCapacity;

    public Train(String model, int year, int countCouches, int couchCapacity) {
        super(model, year);
        this.countCouches = countCouches;
        this.couchCapacity = couchCapacity;
        calculateCapacity();
    }
    private void calculateCapacity (){
        this.capacity = countCouches * couchCapacity;
    }
    public void setCountCouches(int countCouches) {
        this.countCouches = countCouches;
        calculateCapacity();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public int getCountCouches() {
        return countCouches;
    }

    public int getCouchCapacity() {
        return couchCapacity;
    }
}
