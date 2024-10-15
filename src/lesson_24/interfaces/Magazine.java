package lesson_24.interfaces;

public class Magazine implements Printable{
    String name;
    int number;

    public Magazine(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void print() {
        System.out.printf("Magazine %s #%d\n", name, number);
    }

    @Override
    public void test() {
        System.out.println("Test magazine");
    }
}
