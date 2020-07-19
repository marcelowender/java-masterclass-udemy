package br.com.marcelo;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(1052200);
        printYearsAndDays(1440);
    }


    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.printf("Invalid Value");
            return;
        }

        Integer year = Math.round(minutes / 525600);
        int days = Math.round((minutes % 525600) / 1440);
        System.out.printf("%d min = %d y and %d d%n", minutes, year, days);

    }
}
