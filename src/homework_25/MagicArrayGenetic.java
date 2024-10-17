package homework_25;

public class MagicArrayGenetic<T>{
        private T[] array;
        private int cursor; // присвоено значение по умолчанию = 0;

    @SuppressWarnings("unchecked")
        public MagicArrayGenetic() {
            array = (T[])new Object[10];
        }
    @SuppressWarnings("unchecked")
        public MagicArrayGenetic(T[] array) {
            if (array == null || array.length == 0) {
                this.array = (T[])new Object[10];
            } else {
                this.array = (T[])new Object[array.length * 2];
                add(array);
            }
        }

        // Добавление в массив одного элемента
        public void add(T value) {


            // Проверка. Есть ли вообще свободное место во внутреннем массиве
            // Если места нет - нужно добавить место
            if (cursor == array.length - 1) {
                // Расширить массив перед добавлением нового элемента
                expandArray();
            }

            array[cursor] = value;
            cursor++;
        }

        public void add(T... numbers) {
            // с numbers я могу обращаться точно также, как со ссылкой на массив int
            // System.out.println("Приняли несколько интов. А именно: " + numbers.length);
            // System.out.println("Есть индекс у каждого инта, как в массиве. По индексом 0: " + numbers[0]);
            for (int i = 0; i < numbers.length; i++) {
                add(numbers[i]);
            }
        }


        // Динамическое расширение массива
        private void expandArray() {
            System.out.println("Расширяем массив! Курсор = " + cursor);
        /*
        1. создать новый массив бОльшего размера (в 2 раза больше)
        2. Переписать в новый массив все значения из старого (до курсора)
        3. Перебросить ссылку
         */

            // 1
            T[] newArray = (T[])new Object[array.length * 2];

            // 2
            for (int i = 0; i < cursor; i++) {
                newArray[i] = array[i]; // Переписываю все значения из старого массива в новый
            }

            // Перебрасываем ссылку. Переменная array хранит ссылку на "новый" массив
            array = newArray;
            System.out.println("Расширение массива завершено");
        }

        // Возвращает строковое представление массива
        // [1, 14, 16]
        public String toString() {

            if (cursor == 0) return "[]";

            String result = "[";
            for (int i = 0; i < cursor; i++) {
                result = result + array[i] + (i < cursor - 1 ? ", " : "]"); //", " / "]"
            }

            return result;
        }

        // Текущее количество элементов в массиве
        public int size() {
            return cursor;
        }

        // Возвращает значение по индексу
        public T get(int index) {
            if (index >= 0 && index < cursor) {
                return array[index];
            }
            // Написать код, если индекс "не корректный"
            return null; // Хорошего решения нет.
            //Todo Поправить обработку не корректного индекса
        }

    public T remove(int index) {
        if (index >= 0 && index < cursor) {
            T value = array[index];
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--;
            return value;
        } else {
            return null;
        }
    }


    // Поиск по значению. Первое вхождение
        // {1, 100, 5, 5, 100} -> 100 метод вернет индекс первого найдено вхождения = 1
            public int indexOf(T value) {
            for (int i = 0; i < cursor; i++) {
                if (array[i].equals(value)) {
                    return i;
                }
            }
            return -1;
        }

        // Метод поиска по значению. Поиск последнего вхождения
        // Возвращает индекс последнего вхождения значения в массиве
        // {1, 100, 5, 5, 100} -> 100 метод вернет индекс последнего найдено вхождения = 4
        public int lastIndexOf(T value) {

            for (int i = cursor - 1; i >= 0; i--) {
                if (array[i].equals(value)) {
                    return i;
                }
            }

            return -1;
        }


            public boolean removeByValue(T value) {
                int index = indexOf(value);
                if (index == -1) return false;

                remove(index);
                return true;
        }
    }

