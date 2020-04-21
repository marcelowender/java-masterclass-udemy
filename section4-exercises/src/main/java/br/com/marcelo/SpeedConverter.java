package br.com.marcelo;

public class SpeedConverter {


    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(0.0);
        printConversion(1.25);
        printConversion(100.4);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        System.out.printf("%s km/h = %d mi/h%n", String.valueOf(kilometersPerHour), toMilesPerHour(kilometersPerHour));
    }

}

