package br.com.marcelo;

public class FactorPrinter {

    public static void main(String args[]) {
        printFactors(5);
    }


    public static void printFactors(int value) {
        if (value < 1) {
            System.out.println("Invalid Value");

        }
        for (int i = 1; i <= value; i++) {
            if ((value % i) == 0) {
                System.out.println(i);
            }
        }

    }


}
