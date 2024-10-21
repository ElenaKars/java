package homework_26.task3;

public class NumericPair<T extends Number, E extends Number> {
    private T value1;
    private E value2;

    public NumericPair(T value1, E value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public Double getSum(){
        return value1.doubleValue() + value2.doubleValue();
    }
}
