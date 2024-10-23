package lesson_27;

import lists.MyArrayList;

import java.util.Arrays;

public class Lesson27 {
    public static void main(String[] args) {
        MyArrayList<Integer> integers = new MyArrayList<>();

        integers.addAll(3, 6, 7, 3, 2, 5);
        System.out.println(integers);

        integers.add(1000);
        System.out.println(integers);

        System.out.println("size: " + integers.size());
        System.out.println("isEmpty: " + integers.isEmpty());

        int ind = integers.indexOf(1000);
        System.out.println(ind);

        integers.set(ind, -200);
        System.out.println(integers);

        System.out.println("contains 7: " + integers.contains(7));
        System.out.println("contains 0: " + integers.contains(0));

        Integer value = integers.get(30);
        System.out.println("value: " + value);
        value = integers.get(3);
        System.out.println("value: " + value);

        System.out.println(integers.remove(3));
        System.out.println(integers);
        System.out.println(integers.remove(Integer.valueOf(2)));
        System.out.println(integers);

        Integer[] array = integers.toArray();
        System.out.println(Arrays.toString(array));

        MyArrayList<String> strngs = new MyArrayList<>();
//        strngs.add("Hello");
        String[] strArray = strngs.toArray();
        System.out.println(Arrays.toString(strArray));
    }
}
