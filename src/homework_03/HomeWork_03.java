package homework_03;

public class HomeWork_03 {

    public static void main(String[] args) {

// Task 1

        int age = 21;

        double milkPrice = 1.2;

        String name = "Елена";

// Task 2

        int var0 = 0;

        int var1 = 1;

        int var2 = 2;

        int var3 = 3;

        double average = (double)(var0 + var1 + var2 + var3) / 4;

        System.out.println("Task 2: " + average);

        //в случае использования типа int число может быть только целым

// Task 3

        double priceA = 1000;

        double priceB = 500;

        double sum = priceA + priceB;

        double discount10 = sum * 0.1;

        double newPrice = (double) sum - discount10;

        System.out.println("Task 3: New price, discount 10: " + newPrice);
        System.out.println("Amount of discount: " + discount10);


// Task 4

        int day1 = 16;
        int day2 = 18;
        int day3 = 18;
        int day4 = 23;
        int day5 = 23;
        int day6 = 22;
        int day7 = 22;

        int sumTemp = day1 + day2 + day3 + day4 + day5 + day6 + day7;

        int count = 7;

        double tempAverage = (double) sumTemp / count;

        System.out.println("Task 4: The average temperature for the week is: " + tempAverage + " grad");

//Task 5
// В случае деления четного числа на 2, остаток от деления = 0, нечетного - остаток равен 1.
// При делении на 3, остаток от деления может равен 0, 1, 2.

    }
}
