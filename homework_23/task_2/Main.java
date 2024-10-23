package homework_23.task_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Warrior");
        Archer archer = new Archer("Archer");
        Mage mage = new Mage("Mage");

        GameCharacter[] characters = new GameCharacter[3];
        characters[0] = warrior;
        characters[1] = archer;
        characters[2] = mage;

        for (int i = 0; i < characters.length; i++) {
           characters[i].attack();
        }
    }

}
