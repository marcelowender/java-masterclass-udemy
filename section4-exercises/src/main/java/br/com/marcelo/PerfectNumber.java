package br.com.marcelo;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
    }

    public static boolean isPerfectNumber(int value) {

        if (value < 1) {
            return false;
        }

        int perfectNumber = 0;
        for (int i = 1; i < value; i++) {
            if ((value % i) == 0) {
                perfectNumber += i;
            }

        }
        return perfectNumber == value;

    }

}
