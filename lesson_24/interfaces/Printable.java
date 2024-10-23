package lesson_24.interfaces;

public interface Printable {
    //все методы интерфейса по умолч абстрактные и публичные
    void print();

    //начиная с jdk8 доступны методы по умолчанию, имеющие реализацию

    default void test(){
        System.out.println("Test");
    }
    // начиная с jdk8 доступны статические методы
    static void testStatic(String str){
        System.out.println("Static method printable: " + str);
    }

    //опявилась с JDK 9 приватные методы (статич и нестатические),
    //переопределить в классе их невозможно

}
