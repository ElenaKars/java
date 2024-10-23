package lesson_19;

public class FinalDemo {

    public static final double PI = 3.141519;//Constanta

    private static final int[] ints = new int[10];//не является константой, тк состояние объекта могу изменить

    public static final String COUNTRY = "Germany";

    public final int x;

    private final int[] array = new int[10];



    public FinalDemo(int x) {
        this.x = 100;
        //this.x = 10 нельзя поменять
       // this.array = new int [20];
        this.array[0] = 100;
        this.array[array.length - 1] = 15000;
    }

    public void changeX (){
       // x = 15; ошибка компиляции
    }

}
