package lesson_26.cons;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    private void sayHello(){
        System.out.println("hello. I am " + name);
    }
    private void test(String str){
        System.out.println(name + ", " + str);
    }
}
