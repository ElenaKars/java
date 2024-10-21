package lesson_27;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(isEmailValid(email)){
            this.email = email;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)){
            this.password = password;
        }
    }
    private boolean isEmailValid(String email) {
        int indexAt = email.indexOf("@");
        if (indexAt == -1 || indexAt != email.lastIndexOf("@")) return false;

        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if(dotIndexAfterAt == -1) return false;

        //После последней точки есть 2 или более символов
        int lastDotInd = email.lastIndexOf('.');

        if(lastDotInd + 2 >= email.length()) return false;

        //Алфавит, цифры, '-', '_', '.', '@'
        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);

        boolean isPass = (Character.isAlphabetic(ch) ||
                Character.isDigit(ch)||
                    ch == '=' ||
                    ch == '_' ||
                    ch == '.' ||
                    ch == '@');

        if (!isPass) return false;

        }

        //5. До собаки должен быть хотя бы 1 символ

        if(indexAt == 0) return false;

        //6. Первый символ - должна быть буква

        char firstchar = email.charAt(0);
        if(!Character.isAlphabetic(firstchar)) return false;

        return true;

//        // возвращает true если символ буква
//        Character.isAlphabetic('C');
//        // возвращает true если символ цифра
//        Character.isDigit('1');
    }

//    public boolean TwoChars(String email){
//
//    }


    private boolean isPasswordValid(String password) {
        if(password == null || password.length() < 8) {
            System.out.println("Password should be at least 8 characters");
            return false;

        }

        boolean isDigit = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isSpecialSymbol = false;

        boolean[] result = new boolean[4];//по умолчанию false

        String symbols = "!%$@&*()[].,-";
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if(Character.isDigit(ch)) isDigit = true;
            if(Character.isUpperCase(ch)) isUpperCase = true;
            if(Character.isLowerCase(ch)) isLowerCase = true;
            if(symbols.indexOf(ch) >= 0) isSpecialSymbol = true;
        }

        System.out.printf("%s | %s | %s | %s\n", isDigit, isUpperCase, isLowerCase, isSpecialSymbol);
        return isDigit && isUpperCase && isLowerCase && isSpecialSymbol;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
