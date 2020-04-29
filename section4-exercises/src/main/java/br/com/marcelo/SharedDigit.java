package br.com.marcelo;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9, 9));
    }

    public static boolean hasSharedDigit(int first, int second) {
        if ((first < 10 || second < 10) || (first > 99 || second > 99)) {
            return false;
        }

        int firstA = first % 10;
        int firstB = first / 10;

        int secondA = second % 10;
        int secondB = second / 10;


        return firstA == secondA ||
                firstA == secondB ||
                firstB == secondA ||
                firstB == secondB;
    }
}
