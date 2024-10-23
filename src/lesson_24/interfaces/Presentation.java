package lesson_24.interfaces;

public class Presentation implements ColorPrintable {

    String title;
    String author;
    String theme;
    int pages;

    public Presentation(String title, String author, String theme, int pages) {
        this.title = title;
        this.author = author;
        this.theme = theme;
        this.pages = pages;
    }

    @Override
    public void colorPrint() {
        System.out.println("presentation has sent to the printing house ");
        System.out.printf("Printing the presentation in colors: author %s, title: %s\n", author, title);
    }

    @Override
    public void print() {
        System.out.printf("Presentation by author %s title: %s\n", author, title);
    }
}
