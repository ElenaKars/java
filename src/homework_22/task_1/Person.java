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

    public Person() {
        this.speed = 10;
        this.restTime = 15;
    }

    public void run(){
        System.out.println("The speed of the Person is " + speed + "km/h");
        rest();
    }

    public void rest(){
        System.out.println("The person needs rest time " + restTime + "min");
    }

}
