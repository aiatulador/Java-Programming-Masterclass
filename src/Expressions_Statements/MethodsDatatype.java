package Expressions_Statements;

public class MethodsDatatype {
    public static void main(String[] args) {
        int dateOfBirth = 1965;
        int age = calculateAge(dateOfBirth);
        System.out.println("Your Age is: "+ age);
        System.out.println("Your Age is(Method call in Println): " + calculateAge(dateOfBirth));
    }


    public static int calculateAge(int dOB){
       int age = 2023 - dOB;
        return age;
    }



}
