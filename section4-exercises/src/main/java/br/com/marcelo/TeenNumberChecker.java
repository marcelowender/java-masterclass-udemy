package br.com.marcelo;

public class TeenNumberChecker {


    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        return (isTeen(firstNumber) || isTeen(secondNumber) || isTeen(thirdNumber));

    }


    public static boolean isTeen(int value) {
        return value >= 13 && value <= 19;
    }
}
