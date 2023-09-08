package ClassesChallenge;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        bankAccount.setClientName(scanner.nextLine());

        System.out.println("Enter your Account Number: ");
        bankAccount.setAccountNumber(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter your Account Balance: ");
        bankAccount.setBalance(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter your Email: ");
        bankAccount.setEmail(scanner.nextLine());

        System.out.println("Enter your Phone Number: ");
        bankAccount.setPhoneNumber(Integer.parseInt(scanner.nextLine()));

        System.out.println("Do you want to Deposit or Withdraw? Press 1 For Deposit or 2 For Withdraw");
        int depW = Integer.parseInt(scanner.nextLine());

        if(depW ==1){
            System.out.println("Account Name: "+ bankAccount.getClientName());
            System.out.println("Account Number: "+ bankAccount.getAccountNumber());
            System.out.println("Email: "+ bankAccount.getEmail());
            System.out.println("Phone Number: "+ bankAccount.getphoneNumber());
            bankAccount.depositFund(Double.parseDouble(scanner.nextLine()));
        }
        else if(depW ==2){
            System.out.println("Account Name: "+ bankAccount.getClientName());
            System.out.println("Account Number: "+ bankAccount.getAccountNumber());
            System.out.println("Email: "+ bankAccount.getEmail());
            System.out.println("Phone Number: "+ bankAccount.getphoneNumber());
            bankAccount.withdrawFund(Double.parseDouble(scanner.nextLine()));
        } else{
            System.out.println("Invalid Input");
        }








    }
}
