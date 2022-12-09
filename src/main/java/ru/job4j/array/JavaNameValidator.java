package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean rsl =  !name.isEmpty() && isNotUpperLatinLetter(name.charAt(0))
                && !Character.isDigit(name.charAt(0));

        for (int i = 1; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (isNotSpecialSymbol(code) && !Character.isDigit(code)
            && isNotUpperLatinLetter(code) && isNotLowerLatinLetter(code)) {
                rsl = false;
                break;
            }
        }

        return rsl;
    }

    public static boolean isNotSpecialSymbol(int code) {
        return code != 36 && code != 95;
    }

    public static boolean isNotUpperLatinLetter(int code) {
        return code < 65 || code > 90;
    }

    public static boolean isNotLowerLatinLetter(int code) {
        return code < 97 || code > 122;
    }
}
