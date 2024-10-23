package lesson_22.animals;

public class CastingExample {
    public static void main(String[] args) {

        //восходящее преобразование
        Animal animal = new Cat();
        Animal animal1 = new Dog();
        Animal animal2 = new Hamster();

        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal1;
        animals[2] = animal2;

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }

        //нисходящее преобразование

        System.out.println("\n============нисходящее преобразование==========");
        double y = 23.45;
        int x = (int) y;

        Cat catLink;
        Animal animalLink = new Cat();

        catLink = (Cat) animalLink;
        catLink.eat();

        for (int i = 0; i < animals.length; i++) {
            System.out.println("sout: " +animals[i]);

            System.out.println(animals[i].getClass() + " instanceof Cat " + (animals[i] instanceof Cat));

            if (animals[i] instanceof Cat){
                System.out.println(i + "-i индекс может безопасно приведен к Cat");
                Animal current = animals[i];
                Cat tempCat = (Cat) current;
                tempCat.eat();
            }
            System.out.println("========\n");

        }






    }
}
