package homework_22.task_1;

public class Profi extends Person {

    public Profi() {
        this.speed = 20;
        this.restTime = 5;
    }

    @Override
    public void run(){
        System.out.println("The speed of the Profi is " + speed + "km/h");
        rest();
    }

    @Override
    public void rest() {
        System.out.println("The Profi needs rest time " + restTime + "min");

    }
}
