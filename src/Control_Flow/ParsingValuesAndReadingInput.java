package Control_Flow;
import java.util.Scanner;

public class ParsingValuesAndReadingInput {
    public static void main(String[] args) {
        int currentYear = 2023;

        try{
            System.out.println(getInputFromConsole(currentYear));
        }catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }

    }
   public static String getInputFromConsole(int currentYear){

        String name = System.console().readLine("Hello Gentlemen, What's your Name? ");
        String birthYear = System.console().readLine("So "+ name+" What year were you born? ");
        int age = currentYear - Integer.parseInt(birthYear);

        return "You are " +age +" years old";
    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Gentlemen, What's your Name? ");
        String name = scanner.nextLine();

        System.out.println("So " + name + " What year were you born? ");
        String birthYear = scanner.nextLine();

        int age = currentYear - Integer.parseInt(birthYear);

        return "You are " + age + " years old";

    }
}