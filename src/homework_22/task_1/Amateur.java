package homework_22.task_1;

public class Amateur extends Person{

    public Amateur() {
        this.speed = 15;
        this.restTime = 10;
    }

    @Override
    public void run() {
        System.out.println("The speed of the Amateur is " + speed + "km/h");
        rest();
    }

    @Override
    public void rest() {
        System.out.println("The Amateur needs rest time " + restTime + "min");
    }
}
