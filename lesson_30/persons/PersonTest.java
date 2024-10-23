package lesson_30.persons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    Persons persons;
    String startemail = "john@test.com";
    String startPassword = "qwerty1Q$";

    @BeforeEach
    void setUp(){
        persons = new Persons(startemail, startPassword);
    }

    /*
    1.берем валидный емайл
    2. устанавливаем сеттером валидный емайл персон
    3. ожидаем: персон в поле валидный емайл, кот установили в шаге 2
    4. проверить равенство person.getEmail() с валидным емайл, ккоторый мы установили
     */

    @Test
    void testValidEmailSet(){
        String validEmail = "valid@test.com";

        persons.setEmail(validEmail);
        System.out.println("getEmail: " + persons.getEmail());

        assertEquals(validEmail, persons.getEmail());
    }

    /*
    1.берем невалидный емайл
    2. устанавливаем сеттером невалидный емайл персон
    3. ожидаемый результат: емайл установлен не будет
                            значение поля емайл у персон останется прежним
     */

    @ParameterizedTest
            @MethodSource("invalidEmailData")
    void testInvalidEmailSet(String invalidEmail){
        persons.setEmail(invalidEmail);
        Assertions.assertNotEquals(invalidEmail, persons.getEmail());
        Assertions.assertEquals(startemail, persons.getEmail());
    }
    static Stream<String> invalidEmailData(){
        return Stream.of(
                "testmail.net",
                "test@@mail.net",
                "tes@tm@ail.net",
                "test@mailnet",
                "test@mail.ne.t",
                "test@mailne.t",
                "test@mail.net.",
                "@mail.net",
                "1est@mailne.t",
                "test@ mail.net",
                "test@m!ail.net",
                "test+1@mail.net"

        );
    }

    //================HOMEWORK_30======================================================
   @Test
   void testValidPasswordSet(){
       String validPassword = "qwerty1Q$";

       persons.setEmail(validPassword);
       System.out.println("validPassword: " + persons.getPassword());

       assertEquals(validPassword, persons.getPassword());
   }

    @ParameterizedTest
    @MethodSource("invalidPasswordData")
    void testInvalidPasswordSet(String invalidPassword){
        persons.setPassword(invalidPassword);
        Assertions.assertNotEquals(invalidPassword, persons.getPassword());
        Assertions.assertEquals(startPassword, persons.getPassword());
    }
// 1. длина >= 8
//2. Должна быть мин 1 цифра
//3. Должна быть мин 1 маленькая буква
//4. Должна быть мин 1 большая буква
//5. Должна быть мин 1 спец. символ (!%$@&*()[].,-)
    static Stream<String> invalidPasswordData(){
        return Stream.of(
                "1123&Q",
                "Asdf*(!q",
                "123A123!",
                "123a123!",
                "123Qwerty"

        );
    }
}
