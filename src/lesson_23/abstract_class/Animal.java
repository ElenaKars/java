package lesson_23.abstract_class;

abstract class Animal {
    //астр класс может иметь поля, конструктор
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void move();
    // в астрактном классе могут присутствовать методы с реализацией

    public void sayHello(){
        System.out.println("Hello from the animal");
    }
}
