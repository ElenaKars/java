package lesson_24.interfaces;

public class App {
    public static void main(String[] args) {
        Book book = new Book("Мастер и Маргарита", "М. Булгаков");

        book.print();

        Printable book1 = new Book("Философия Java", "Б. Эккель");
        book1.print();

        Magazine magazine = new Magazine("Vogue", 67);
        magazine.print();

        Printable magazine1 = new Magazine("Bazar", 45);
        magazine1.print();

        System.out.println(magazine1.getClass());

        book1.test();
        magazine.test();

        Printable.testStatic("Static method");

        Presentation pps = new Presentation("How to build an app", "noname", "Business", 23);
        pps.print();
        pps.colorPrint();
        pps.test();

        ColorPrintable colorPrintable = pps;
        colorPrintable.colorPrint();

        Printable printable1 = pps;
        printable1.print();
    }
}
