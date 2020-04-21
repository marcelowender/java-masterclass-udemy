package br.com.marcelo;

public class IntEqualityPrinter {


    public static void main(String[] args) {
        printEqual(3, 1, 3);
    }


    public static void printEqual(int first, int second, int third) {
        if (first < 0 || second < 0 || third < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (first == second && first == third) {
            System.out.println("All numbers are equal");
            return;
        }


        if (first != second && first != third && third != second) {
            System.out.println("All numbers are different");
            return;
        }

        System.out.println("Neither all are equal or different");

    }
}
