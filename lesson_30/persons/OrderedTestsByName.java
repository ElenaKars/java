package lesson_30.persons;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)//по алфавитному порядку
public class OrderedTestsByName {
    @Test
    void testB(){
        System.out.println("testB");
    }
    @Test
    void testA(){
        System.out.println("testA");
    }
    @Test
    void testC(){
        System.out.println("testC");
    }
}
