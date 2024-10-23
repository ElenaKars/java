//Task 1
//Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи
//
//У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;
//
//Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5
//
//В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам

package homework_22.task_1;

public class Person {
       public int speed;
       public int restTime;

       private String typeRunner = "Person";

    public Person() {
        this.speed = 10;
        this.restTime = 15;
    }

    public Person(int speed, int restTime) {
        this.speed = speed;
        this.restTime = restTime;
    }

    public void run(){
        System.out.printf("The speed of %s is %d km/h\n", typeRunner, speed);
        rest();
    }

    public void rest(){
        System.out.printf("%s needs rest time %d min\n",typeRunner, restTime);
    }


    public String getTypeRunner() {
        return typeRunner;
    }

    public void setTypeRunner(String typeRunner) {
        this.typeRunner = typeRunner;
    }

    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "run speed: " + speed +
                ", rest time: " + restTime +
                ", type: " + typeRunner;
    }
}
