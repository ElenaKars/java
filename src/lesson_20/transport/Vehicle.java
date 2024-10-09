package lesson_20.transport;

public class Vehicle {
    private String model;
    private int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void start (){
        System.out.println(model + " starts");
    }

    public void stop(){
        System.out.println(model + " stops");
    }

    public String toString(){
        return model + ", the year of production is: " + year;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
