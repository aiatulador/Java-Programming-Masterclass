package ClassesChallenge;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String clientName;
    private String email;
    private int phoneNumber;

    public BankAccount(){
        System.out.println("Empty Constructor Called: ");
    }

    public BankAccount(int accountNumber, double balance, String clientName, String email, int phoneNumber){
        System.out.println("Another Constructor with parameter called: ");
        this.accountNumber= accountNumber;
        this.balance= balance;
        this.clientName= clientName;
        this.email= email;
        this.phoneNumber=phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getClientName() {
        return clientName;
    }

    public String getEmail() {
        return email;
    }

    public int getphoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int number) {
        this.phoneNumber = number;
    }

    public void depositFund(double depositAmount, double balance) {
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + balance);
    }

    public void withdrawFund(double withdrawAmount) {
        if(balance-withdrawAmount<0){
            System.out.println("Insufficient Funds");
        }else{
            balance -= withdrawAmount;
            System.out.println("$" + withdrawAmount + " Withdrawn. " + "New Balance is: " + balance);
        }
    }
}
