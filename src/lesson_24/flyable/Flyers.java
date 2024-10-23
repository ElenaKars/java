package lesson_24.flyable;

public class Flyers {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(50);
        Flyable duck = new Duck();

        Flyable[] flyables = new Flyable[2];
        flyables[0] = airplane;
        flyables[1] = duck;

        for (int i = 0; i < flyables.length; i++) {
            Flyable flyable = flyables[i];
            if(flyable instanceof Airplane){
                Airplane airplaneLink = (Airplane) flyable;
                System.out.println("airplaneLink.takePassenger(): " + airplaneLink.takePassenger());
                System.out.println("Cahacity: " + airplaneLink.capacity);
                System.out.println("airplaneLink.countPassengers()" + airplaneLink.countPassengers());
            }
            flyable.fly();
        }
    }
}
