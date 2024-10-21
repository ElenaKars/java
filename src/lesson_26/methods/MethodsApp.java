package lesson_26.methods;

import lists.MyArrayList;

public class MethodsApp {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 4, 5};
        String[] strings = {"Hello", "Java","World"};

        System.out.println(Util.printArray(strings));
        double sum = Util.sum(arr);
        System.out.println(sum);

        MyArrayList<String> strings1 = new MyArrayList<>();
        strings1.addAll("Spain", "Germany", "Russia");
    }
}
