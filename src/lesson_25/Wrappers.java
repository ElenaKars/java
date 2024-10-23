package lesson_25;

import javax.sound.midi.Soundbank;

public class Wrappers {

    // Классы-оббертки используются в джава для представления примитивных типов данных, как объектов
    // Byte => обертка для byte
    // Short => обертка для short
    // Integer => обертка для int
    // Long => обертка для long
    // Float => обертка для  float
    // Double => обертка для double
    // Character => обертка для char
    // Boolean => обертка для boolean

    public static void main(String[] args) {
        // Автоматическая приведение типов
        // Автоупаковка и автораспаковка

        Integer wrapperInt = 5;// автоупакрвка примитива int в ссылочный тип Integer
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt;// автораспаковка из типа Integer автоматически преобразовывание в примитив int
        //сравнение объектов
        //кэширование объектов -128...127

        Integer a = 127;
        Integer b = 127;
        System.out.println("a==b: " + (a==b));
        System.out.println("a.equals(b): " + a.equals(b));

        Integer c = 128;
        Integer d = 128;
        System.out.println("c==d: " + (c==d));
        System.out.println("c.equals(d): " + c.equals(d));

        System.out.println("\n================\n");

        Integer maxValue = Integer.MAX_VALUE;
        System.out.println("maxValue: " + maxValue);
        System.out.println("minValue: " + Integer.MIN_VALUE);

        //Схожие методы для всех оберточных типов

        //1. valueOf() = преобразовывает примитивы или строку в объект обертки

        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf(127);
        System.out.println("e==f: " + (e == f));

        Integer intStr = Integer.valueOf("123");
        System.out.println(intStr + 100);

        Double doubleWrap = Double.valueOf(154.5);
        System.out.println("Double.valueOf(154.5): " + doubleWrap);

        //2. parseXXX() = преобразует строку в соответсвующий примитив
        // "456"
        System.out.println(Integer.parseInt("456") + 100);

        double d1 = Double.parseDouble("345.5") + 200;
        System.out.println(d1);

        //3. toString = возвращает строковое представление числа
        System.out.println(doubleWrap);

    }
}
