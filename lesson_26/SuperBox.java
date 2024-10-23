package lesson_26;

public class SuperBox {
    private int value;

    public SuperBox(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SuperBox{" +
                "value=" + value +
                '}';
    }
}
