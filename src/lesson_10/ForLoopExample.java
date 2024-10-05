package lesson_10;

public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i < 7; i++){
            if ( i == 3) break; //заканчивает текущую итерацию цикла и весь цикл
            System.out.println(i + "; ");
            }
        System.out.println("\nEnd loop with break");

        }
    }

