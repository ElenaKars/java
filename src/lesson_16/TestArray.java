package lesson_16;

public class TestArray {
    public static void main(String[] args) {
        MagicArray magicArray = new MagicArray();
        magicArray.add(100);
        magicArray.add(12);
        magicArray.add(67,98, 87, 87, 84, 33, 99);
        System.out.println(magicArray.size());
        System.out.println(magicArray.toString());
    }
}
