package lesson_23.abstract_class;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Cat " + name + " likes to eat");
    }

    @Override
    void move() {
        System.out.println("Cat " + name + " moves");
    }
}
