package br.com.marcelo;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int first, int second, int third) {
        if (!isValid(first) || !isValid(second) || !isValid(third)) {
            return false;
        }

        int firstA = first % 10;
        int secondA = second % 10;
        int thirdA = third % 10;

        return firstA == secondA || firstA == thirdA || secondA == thirdA;


    }

    public static boolean isValid(int value) {
        return value >= 10 && value <= 1000;
    }

}
