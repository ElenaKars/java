package homework_23.task_2;

public class Mage extends GameCharacter{

    public Mage(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " uses the magic");
    }
}
