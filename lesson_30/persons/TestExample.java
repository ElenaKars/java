package lesson_30.persons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

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
@ParameterizedTest
    @ValueSource(ints = {1, 2, -1, 4, 5})
    void testInts (int value) {
    System.out.println("current value: " + value);
    Assertions.assertTrue(value > -5);
}
//CSV-Comma separated values
    @ParameterizedTest
    @CsvSource({"apple, 1", "cherry, 3", "banana, 6"})
    void testWithCSVSource(String friut, int rank){
        System.out.println(friut + " | " + (rank + 10));
        assertTrue(friut.length() > 4 && rank > 0);
    }

    //источник данных data.csv
    @ParameterizedTest
    @CsvFileSource(resources = "data.csv")

    void testCsvFileSource(String fruit, int rank, boolean flag){
        System.out.println(fruit + " | " + rank + " | " + !flag);
        assertNotNull(fruit);
        assertTrue(rank > 0);
    }
    //Источник данных - метод
    @ParameterizedTest
    @MethodSource("testDataFruit")
    void testMethodSource(String fruit){
            System.out.println(fruit);
            assertNotNull(fruit);
        }

        static Stream<String> testDataFruit(){
            return Stream.of("apple", "banana", "cherry");
        }

        @ParameterizedTest
    @MethodSource("testDataInt")

    void testMethodSource2(int value){
            System.out.println("current value: " + value);
            assertNotEquals(100, value);
        }
        static Stream<Integer> testDataInt(){
    return Stream.of(1, 2, -1, 4, 5);
        }

        @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMethodSource3(int value, int expected, boolean isEqual){
            System.out.println(value + " | " + expected + " | " + isEqual);
            int result = value * value;
//            assertEquals(expected, result);
            assertEquals(isEqual, result == expected);
}
static Stream<Arguments> testDataArguments(){
    return Stream.of(
            Arguments.of(2, 4, true),
            Arguments.of(3, 9, true),
            Arguments.of(4, 15, false)
    );
}

@ParameterizedTest
    @MethodSource("testPersonsData")
    void testPersonsData (Persons person, String newEmail){
    System.out.println(person);
    System.out.println(newEmail);
}
static  Stream<Arguments> testPersonsData(){
    return Stream.of(
            Arguments.of(new Persons("test@mail.com", "pass1Q!4"), "new1234@gmail.com"),
            Arguments.of(new Persons("invalid.mail.com", "password" ), "mail.test.com")
    );
}
    }
