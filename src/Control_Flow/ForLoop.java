package Control_Flow;

public class ForLoop {
    public static void main(String[] args) {

        /*for(int counter = 1; counter<6 ; counter++){
            double amount = 10000;
            System.out.println(counter +". "+ amount + " at "+ counter+" % "+ " interest= "+calculateInterest(amount,counter));
        }*/

        for(double i=7.5; i<= 20; i+=0.25){
            double interestAmount = calculateInterest(5465400,i);
            if(i > 11.5){
                break;
            }
            System.out.println("$100.00 at "+ i + "% interest = $ "+ interestAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate /100));
    }
}
