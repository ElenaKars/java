package homework_23.task_2;

public class Archer extends GameCharacter{
    public Archer(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " uses the arch");
    }
}
