package lesson_16;

public class MagicArray {
    int[] array;
    int cursor;//по умолчанию значение int = 0

    public MagicArray(){
        array = new int[2];

    }

    //добавление в массив одного элемента
    void add(int value){

        //добавить проверку на наличие свободного места во внутреннем массиве

        if(cursor == array.length - 1){
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }


    void add(int... numbers){
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }

    }
    void expandArray(){
        System.out.println("Расширяем массив. Курсор = " + cursor);

        int[] newArray = new int[array.length * 2];
        //переписать старые значения

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        //перебрасываем ссылку
        array = newArray;
        System.out.println("Расширение массива завершено");
    }

    public String toString(){
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + (i < cursor -1 ? ", " : "]");
        }
        return result;
    }
    int size(){
        return cursor;
    }

    //возвращает знвчение по индексу

    int get(int index){
        if(index >= 0 && index < cursor){
            return array[index];
        }
        return Integer.MIN_VALUE;
        //здесь поправить
    }

    int remove(int index){
        return -1;
    }
}
