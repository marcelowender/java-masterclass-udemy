package br.com.marcelo;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(123));
        System.out.println(sumFirstAndLastDigit(124));
        System.out.println(sumFirstAndLastDigit(48924));
        System.out.println(sumFirstAndLastDigit(77777));

    }


    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int originalValue = number;
        while (number > 0) {
            int remainer = number % 10;
            if (originalValue == number) {
                sum += remainer;    
            }
            number -= remainer;
            number /= 10;
            if (number == 0) {
                sum += remainer;
            }

        }
        return sum;
    }

}
