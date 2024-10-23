package lesson_26.cons;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MagicDemo {
    public static void main(String[] args) throws Exception{
        Person person = new Person("John");

        Field nameField = Person.class.getDeclaredField("name");

        //открываю доступ к полю
        nameField.setAccessible(true);
        //меняем значение у поля
        nameField.set(person, "Maria");

        System.out.println("New name: " + nameField.get(person));

        //возвращаем\закрываем поле
        nameField.setAccessible(false);

        //находим приватный метод sayHello

        Method sayHelloMethod = Person.class.getDeclaredMethod("sayHello");

        sayHelloMethod.setAccessible(true);

        sayHelloMethod.invoke(person);

        sayHelloMethod.setAccessible(false);

        //вызываем метод с параметрами
        Method testMethod = Person.class.getDeclaredMethod("test", String.class);

        testMethod.setAccessible(true);

        testMethod.invoke(person, "Java");

//        testMethod.setAccessible();
    }
}
