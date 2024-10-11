package lesson_22.animals;

public class Cat extends Animal{

    public void eat(){
        System.out.println("Cat is eating");
    }

    //переопределить родительский метод voice()

    @Override
    public void voice(){
        System.out.println("Cat says Meow!");
    }

    @Override
    public String toString() {
        return "Cat toString";
    }

    //перегрузка метода - статический полиморфизм

    public void voice(String str){
        System.out.println("cat says " + str);
    }

}
