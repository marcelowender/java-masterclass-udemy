package br.com.marcelo;

public class SumOfDigits {


    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigitsChar(125));
    }


    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            int remainer = number % 10;
            sum += remainer;
            number -= remainer;
            number /= 10;

        }

        return sum;
    }


    private static int sumDigitsChar(int number) {
        char[] strNumer = String.valueOf(number).toCharArray();
        int sum = 0;
        for (int i = 0; i < strNumer.length; i++) {
            sum += Character.getNumericValue(strNumer[i]);
        }

        return sum;
    }
}
