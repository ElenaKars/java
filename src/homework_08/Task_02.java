//Task 2
//Используйте цикл while для решения задачи:
//
//Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
package homework_08;

public class Task_02 {
    public static void main(String[] args) {
        String str = "Task";
        int i = 1;

        while (i<=10){
            System.out.println("Task" + i);
            i++;
        }
    }
}
