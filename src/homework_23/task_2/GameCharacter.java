//Task 2
//Создайте абстрактный класс GameCharacter, который представляет базовый класс для игровых персонажей.
//Определите абстрактный метод attack(), который будет различаться для разных типов персонажей (например, воин атакует мечом, а маг использует магические заклинания).
//Создайте несколько конкретных подклассов, представляющих разные типы персонажей, такие как Warrior, Mage, Archer, и т. д.
//Переопределите метод attack() для каждого класса.
//Создайте массив из игровых персонажей разных типов. Вызовите у каждого метод attack() в цикле.
package homework_23.task_2;

abstract class GameCharacter {
    public String name;

    public GameCharacter(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                '}';
    }

    abstract void attack();

}
