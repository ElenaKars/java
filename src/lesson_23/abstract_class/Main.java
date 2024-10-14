package lesson_23.abstract_class;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Sweety");
        cat.eat();
        cat.sayHello();
        cat.move();

        //попытка интсанцировать\создать экземпляр
        // абстрактного класса приведет к ошибке
        // но можно использовать полиформизм

//        Animal animal = new Cat();

        Dog dog = new Dog("Rex");
        dog.eat();
        dog.sayHello();
        dog.move();

        animalTest(cat);
        }
        public static void animalTest(Animal animal){
        animal.sayHello();
        }

    }

