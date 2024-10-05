package homework_05;

public class task_2 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";

        String space = " ";

        String concatStr1 = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        String concatStr2 = str1.concat(str2).concat(space).concat(space).concat(str3).concat(space).concat(str4).concat(space).concat(str5);
        String concatStr3 = String.join(" ", str1, str2, str3, str4, str5);

        System.out.println(concatStr1);
        System.out.println(concatStr1.length());
        System.out.println(concatStr2);
        System.out.println(concatStr2.length());
        System.out.println(concatStr3);
        System.out.println(concatStr3.length());

        //Task 2.2

        System.out.println(concatStr3.replace("powerful", "super"));

        boolean isAge = concatStr3.contains("age");
        System.out.println(isAge);
        int index = concatStr1.indexOf("age");
        System.out.println(index);
    }
}
