package lesson_18;

public class Test {
    //non static поле класса
    int x;

    static int staticY;

    public void testNonStatic(){
        //у нестатических методов есть доступ ко всем членам класса
        x++;
        staticY++;
        //может вызывать не статические и статические методы
        testStatic();
    }
    public static void testStatic(){
        //статические методы видят только статич члены класса
        //x++; нет доступа к нестатическиму полю
        staticY++;
        //может вызывать только статические методы
    }
    // метод main статический
    public static void main(String[] args) {
        //переменную х не видит. У статич метода нет доступа к нестатическим членам
        testStatic();
        //testNonStatic(); не могу вызвать нестатический метод
        Test test = new Test();
        //могу использовать нестатический метод, используя ссылку на объект
        test.testNonStatic();
    }
}
