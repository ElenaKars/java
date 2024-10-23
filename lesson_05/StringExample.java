package lesson_05;

public class StringExample {
    public static void main(String[] args) {
        String string = "Java";
        String string1 = new String("Hello");

        System.out.println(string);

        //Методы
        // 1. Длина

        int length = string.length();
        System.out.println(length);

        // 2. to upper case

        System.out.println(string.toUpperCase());

        // String неизменна
        // результат метода можем сохранить в ту же самую переменную, переписав ее значение.

        String str1 = "One";
        String str2 = "Two";
        String str3 = "Three";

        //канкатенация

        String concatStr = str1 + str2 + str3;
        System.out.println(concatStr);

        String concatStr3 = str1.concat(str2).concat(str3).concat("!");
        System.out.println(concatStr3);

        String concatStr4 = String.join(" ",str1,str2, str3);
        System.out.println(concatStr4);

        String digits = "0123456";
        System.out.println(digits.length());

        char firstChar = digits.charAt(0);
        System.out.println(firstChar);

        char lastChar = digits.charAt(digits.length() - 1);
        System.out.println(lastChar);

        String subString = digits.substring(2);
        System.out.println(subString);

        String subString2 = digits.substring(2,7); // до 7 невключительно!
        System.out.println(subString2);

    }
}
