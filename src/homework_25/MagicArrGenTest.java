package homework_25;

public class MagicArrGenTest {
    public static void main(String[] args) {
        MagicArrayGenetic <Integer> numBox = new MagicArrayGenetic<>();
        numBox.add(3, 4, 5, 9);
        System.out.println(numBox);
        System.out.println(numBox.indexOf(4));
        System.out.println(numBox.removeByValue(5));

        MagicArrayGenetic<String> strBox = new MagicArrayGenetic<>();
        strBox.add("Java");
        strBox.add("Python", "JS");
        System.out.println(strBox);
        System.out.println(strBox.removeByValue("Python"));
        System.out.println(strBox);
    }
}
