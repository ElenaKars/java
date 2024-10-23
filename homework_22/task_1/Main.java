package homework_22.task_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();

        person.run();

        Amateur amateur = new Amateur();

        amateur.run();

        Profi profi = new Profi();

        profi.run();

        Person[] persons = new Person[3];
        persons[0] = person;
        persons[1] = amateur;
        persons[2] = profi;

        System.out.println(Arrays.toString(persons));
        }

    }
