package lesson_20;

import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args) {
        String str = "Java " + "is " + "the " + "best";

        //StringBuilder - это класс в java, предназначенный для эффективного
        // создания и модификации изменяемых последовательностей символов

        StringBuilder sb1 = new StringBuilder(str);
        StringBuilder sb = new StringBuilder("Hello");
//метод для добаления в конец строки справа/аналог канкатенации
        sb.append(" ").append("Java");

        //получить строковое значение
        String string = sb.toString();
        System.out.println(string);

        // Метод вставить символы в указанную позицию

        StringBuilder sb2 = new StringBuilder("Hello world");
        sb2.insert(6, "beautiful ");
        System.out.println(sb2);

        //заменить подстроку (определяется индексами) на указанное значение

        StringBuilder sb3 = new StringBuilder("Hello World");
        sb3.replace(6, 11, "Java");
        System.out.println(sb3);

        //удалить подстроку в диапозоне от start до end

        StringBuilder sb4 = new StringBuilder("Hello World!");
        sb4.delete(5, 11);
        System.out.println(sb4);

        //реверс

        StringBuilder sb5 = new StringBuilder("Hello World!");
        sb.reverse();
        System.out.println(sb5);

        //количество символов в строке
        System.out.println("length: " + sb5.length());

        // получить символ по индексу

        char ch = sb5.charAt(3);
        System.out.println(ch);

        //получить подстроку

        sb = new StringBuilder("Hello World!");
        String substring = sb.substring(3);//от индекса до конца строки
        System.out.println("sb.substring(3): " + substring);

        substring = sb.substring(6, 9); // от начала до конца
        System.out.println(substring);

        //изменять размер последовательности символов
        sb = new StringBuilder("Hello");

        sb.setLength(10);
        System.out.println("sb.setLength(10): " + sb);
        char ch1 = sb.charAt(8);
        System.out.println("sb.charAt(8): " + (int) ch1);

        sb.setLength(3);
        System.out.println("sb.setLength(3): " + sb);

        //написать метод, кот запрашивает у пользователя строку, состоящую из нескольких слов и возвращающий аббревеатуру этой фразы

        String result = phraseString();
        System.out.println("Аббревеатура: " + result);

        //потокобезопасный брат StringBuilder
        StringBuffer stringBuffer = new StringBuffer();
    }
        public static String phraseString(){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку из нескольких слов");

            String input = scanner.nextLine();
            String[] words = input.split(" ");
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                sb.append(word.charAt(0));
            }
return sb.toString().toUpperCase();
        }
}
