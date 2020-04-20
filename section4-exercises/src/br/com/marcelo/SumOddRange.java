package br.com.marcelo;

public class SumOddRange {


    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
    }


    public static int sumOdd(int start, int end) {
        if (start < 0 || start > end ) {
            return -1;
        }

        int sumOdd = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sumOdd += i;
            }

        }
        return sumOdd;
    }


        private static boolean isOdd(int number) {
            if (number < 0) {
                return false;
            }
            return (number % 2) != 0;
        }

}
