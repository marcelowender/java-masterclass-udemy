package br.com.marcelo;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(121));
    }


    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }

        if (number < 10) {
            return true;
        }

        int reverse = 0;
        int originaNumber = number;
        while (number > 0) {

            int remainer = number % 10;
            reverse *= 10;
            reverse += remainer;
            number -= remainer;
            number /= 10;
        }

        return reverse == originaNumber;

    }
}
