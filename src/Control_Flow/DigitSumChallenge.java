package Control_Flow;

public class DigitSumChallenge {
    public static void main(String[] args) {
        int positiveInteger = 125;
        System.out.println(sumDigits(positiveInteger));
    }

    public static int sumDigits(int positiveInteger) {

        if (positiveInteger<0){
            return -1;
        }
        int sum =0;
        while (positiveInteger>9){
            sum += positiveInteger %10;
            positiveInteger =positiveInteger/10;
        }
        sum += positiveInteger;

        return sum;
    }

}
