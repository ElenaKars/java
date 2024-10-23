// Task 2
//Написать метод, принимающий на вход массив строк.
// Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
package homework_10;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
      String[] strings = {"It's", "a", "wonderful", "day"};

        String[] result = checkStr(strings);
        System.out.println(Arrays.toString(result));

        System.out.println("========test====null===");
        strings = null;
        //strings = new String[0];
        String[] res = checkStr(strings);

        System.out.println("\n========null in array");

        strings = new String[]{null, null, "wonderful", "day"};
        //strings = new String[]{null, null, null};
        System.out.println(Arrays.toString(strings));
        res = checkStr(strings);
        System.out.println(Arrays.toString(res));
    }



    public static String[] checkStr (String[] strings) {
        if (strings == null || strings.length == 0) {
            return new String[0];
        }
        String notNullValue = findFirstNullInArray(strings);
        if (notNullValue == null){
            return new String[0];
        }
        String min = notNullValue;
        String max = notNullValue;

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i] + "; ");
            if(strings[i] != null && strings[i].length() < min.length()){
                min = strings[i];
            }
            if(strings[i] != null && strings[i].length() > max.length()){
                max = strings[i];
            }
        }
        return new String[] {min, max};
    }
public static String findFirstNullInArray (String[] strings){
    for (int i = 0; i < strings.length; i++) {
if(strings[i] != null){
    return strings[i];
}
    }
    return null;
}


//    public static String[] checkStr (String[] strings) {
//
//        String min = strings[0];
//        String max =  strings[0];
//
//        for (int i = 0; i < strings.length; i++) {
//           if (strings[i].length() < min.length()){
//               min = strings[i];
//           }
//           if (strings[i].length() > max.length()) {
//               max = strings[i];
//           }
//        }
//    return new String[] {max, min};
//    }
}
