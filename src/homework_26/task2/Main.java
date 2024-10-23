//Task 2. * Опционально
//Обобщенный статический метод “Печать двух списков”
//Напишите обобщенный статический метод printTwoLists, который принимает два параметра типа MyArrayList и MyArrayList, и выводит элементы обоих списков.
//
//Требования:
//
//Метод должен быть обобщенным по двум типам T и U.
//Элементы списков могут быть разных типов.

package homework_26.task2;

import lists.MyArrayList;

public class Main {
    public static <T, U> void printTwoLists (MyArrayList<T> list, MyArrayList<U> list1){

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }

    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Hello");
        list.add("World");

        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(34);
        list1.add(45);

        printTwoLists(list, list1);
    }
}

