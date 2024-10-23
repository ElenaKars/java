package lesson_23.abstract_class;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Dog also likes to eat");
    }

    @Override
    public void sayHello(){
        System.out.println("Dog " + name + " can say Hello!");
    }

    @Override
    void move() {
        System.out.println(name + " is moving");
    }
}
