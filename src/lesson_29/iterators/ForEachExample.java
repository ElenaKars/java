package lesson_29.iterators;

import lists.MyArrayList;

import java.util.Iterator;

public class ForEachExample {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("Hello");
        list.add("World");
        list.add("Java");


        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }

        //for-each
        for (String s: list){
            System.out.println(s);
        }

    }

}
