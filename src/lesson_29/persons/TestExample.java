package lesson_29.persons;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TestExample {
    //метод, который выполняется перед каждым тестовым методом
    @BeforeEach
    void setUp(){
        System.out.println("Method @BeforeEach");
    }
    /*
    @BeforeAll метод запускается только один раз перед первым тестом
    @AfterEach выполняется после каждого теста
    @AfterAll выполняется один раз после выполнения всех тестов
    @Disabled отключает тест
    @Nested позволяет создать вложенный тестовый класс, для логической группировки тестовых методов
     */
@Test
    public void testAddition(){

    int result = 2 + 2;//здесь може быть вызов метода
    //ожидаемое значение 4
    //реальное значение в переменной result

    //методы проверки утверждений
    //assertEquals(expected, actual) - проверяет равны ли 2 значения

    Assertions.assertEquals(4, result);
    Assertions.assertNotEquals(5, result);
    Assertions.assertTrue(result >= 4);
    Assertions.assertFalse(result > 5);
    assertNull(null);
    assertNotNull("String");
}
@Test
public void emptyTest(){
    // пустой тест счтается пройденным
}
@ParameterizedTest
@ValueSource(strings = {"apple", "banana", "orange"})
public void testFruits(String fruit){
    System.out.println(fruit);
    assertTrue(fruit.length() > 2);

}
}