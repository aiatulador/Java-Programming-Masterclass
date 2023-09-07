package Control_Flow;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        System.out.println(sumOfValidIntegers());
    }

    public static String sumOfValidIntegers() {
        int i = 1;
        int sum =0;
        Scanner scanner = new Scanner(System.in);
        while (i <= 5) {
            System.out.println("Enter number #"+i+":");
            String number = scanner.nextLine();
            try{
                sum += Integer.parseInt(number);
                i++;
            }catch (NumberFormatException nfe){
                System.out.println("Invalid Number. ");
            }

        }
        return "The Sum of the 5 integer is: "+ sum;
    }
}