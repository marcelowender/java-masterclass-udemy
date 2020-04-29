package br.com.marcelo;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81, 153));
        System.out.println(getGreatestCommonDivisorRecursive(81, 153));
    }

    /**
     * Solution based on euclidian algoritm
     * <p>
     * |1 |1 |2   ----> quotient
     * 25|15|10|5   ----> Value
     * 10|5 |0 |   ----> Remain value
     */
    //First solution
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int number = -1;
        while (number != 0) {
            number = first % second;
            if (number == 0) {
                return second;
            }
            first = second;
            second = number;

        }
        return -1;

    }

    //Second solution
    public static int getGreatestCommonDivisorRecursive(int first, int second) {
        if (second == 0) {
            return first;
        }
        return getGreatestCommonDivisorRecursive(second, first % second);


    }
}
