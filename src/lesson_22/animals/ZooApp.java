package lesson_22.animals;

public class ZooApp {
    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.voice();
        System.out.println(cat.toString());
        cat.eat();
        cat.voice("Shshshshsh");

        System.out.println("\n==============");

        Dog dog = new Dog();
        dog.voice();
        System.out.println(dog.toString());

        System.out.println("\n==============");

        Hamster hamster = new Hamster();
        hamster.voice();
        System.out.println(hamster.toString());

        System.out.println("\n==============");
        Test test = new Test();
        System.out.println(test.toString());

        System.out.println(hamster);
    }
}
