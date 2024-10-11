package lesson_22.animals;

public class Hamster extends Animal{

    //переопределим родительский метод


    @Override
    public void voice() {
        System.out.println("Hamster says hrum-hrum");

    }
}
