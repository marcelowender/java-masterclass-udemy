package br.com.marcelo;

public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(12528));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int remainer = number % 10;
            number -= remainer;
            number /= 10;
            if (remainer % 2 == 0) {
                sum += remainer;
            }
        }
        return sum;

    }

}
