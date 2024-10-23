package lesson_27;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("email", "password");

        System.out.println(person);

        person.setEmail("test@mail.com");
        System.out.println(person.getEmail());


    }
}
