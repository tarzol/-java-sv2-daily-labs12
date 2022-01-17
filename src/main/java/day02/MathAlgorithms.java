package day02;

public class MathAlgorithms {

    public int findHighestCommonDivider(int number1, int number2) {
        int highestDivider = 1;
        /*int cycler = number1;
        if ( number2 < number1) {
            cycler = number2;
        }*/
        for ( int i = 1; i <= number1 || i<= number2; i++ ) {
            if ( (number1 % i) == 0 && (number2 % i) == 0 ) {
                highestDivider = i;
            }
        }
        return highestDivider;
    }

    public static void main(String[] args) {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();
        System.out.println(mathAlgorithms.findHighestCommonDivider(9, 12));
    }
}
