package br.com.marcelo;

public class DecimalComparator {


    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2) {

        if ((int) (value1 * 1000) == (int) (value2 * 1000)) {
            return true;
        } else {
            return false;
        }

    }

}
